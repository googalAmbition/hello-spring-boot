package com.tcoding.demo.file.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 陈天成
 * @date 2022/9/28.
 */

@Controller
public class IndexController {

    @GetMapping
    public String index() {
        return "index";
    }

    @ResponseBody
    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file) {

        if (file.isEmpty()) {
            return "文件为空";
        }
        // 获取文件名
        String fileName = file.getOriginalFilename();

        // 设置文件存储路径
        // 因为测试，就放在classpath下。正式环境是要存在文件服务器上
        try {
            String filePath = new ClassPathResource("/").getURI().getPath();
            String path = filePath + fileName;
            File dest = new File(path);
            // 检测是否存在目录
            if (!dest.getParentFile().exists()) {
                // 新建文件夹
                dest.getParentFile().mkdirs();
            }
            file.transferTo(dest);
            // 文件写入
            return "上传成功";
        } catch (IllegalStateException | IOException e) {
            e.printStackTrace();
        }

        return "上传失败";
    }

    @ResponseBody
    @PostMapping("/batch")
    public String handleFileUpload(HttpServletRequest request) throws IOException {
        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
        MultipartFile file;
        for (int i = 0; i < files.size(); ++i) {
            file = files.get(i);
            String filePath = new ClassPathResource("/").getURI().getPath();
            if (!file.isEmpty()) {
                try (BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(filePath + file.getOriginalFilename()));) {
                    byte[] bytes = file.getBytes();
                    // 写入
                    stream.write(bytes);
                } catch (Exception e) {
                    return "第 " + i + " 个文件上传失败 ==> " + e.getMessage();
                }
            } else {
                return "第 " + i + " 个文件上传失败因为文件为空";
            }
        }
        return "上传成功";
    }

    @ResponseBody
    @GetMapping("/download")
    public String downloadFile(HttpServletResponse response) throws IOException {
        String fileName = "test.svg";
        //设置文件路径
        String filePath = new ClassPathResource("/").getURI().getPath();
        File file = new File(filePath + fileName);
        //File file = new File(realPath , fileName);
        if (file.exists()) {
            // 设置强制下载不打开
            response.setContentType("application/force-download");
            // 设置文件名
            response.addHeader("Content-Disposition", "attachment;fileName=" + fileName);
            byte[] buffer = new byte[1024];

            try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
                OutputStream os = response.getOutputStream();
                int i = bis.read(buffer);
                while (i != -1) {
                    os.write(buffer, 0, i);
                    i = bis.read(buffer);
                }
                return "下载成功";
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "下载失败";
    }
}

