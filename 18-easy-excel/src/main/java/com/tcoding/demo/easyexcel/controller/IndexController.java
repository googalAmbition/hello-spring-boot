package com.tcoding.demo.easyexcel.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.util.ListUtils;
import com.tcoding.demo.easyexcel.excel.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 陈天成
 * @date 2022/10/13.
 */
@Slf4j
@Controller
public class IndexController {

    @GetMapping
    public String index() {
        return "index";
    }

    /**
     * 读取上传的excel
     */
    @ResponseBody
    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file) throws IOException {

        List<Book> result = new ArrayList<>();
        EasyExcel.read(file.getInputStream(), Book.class, new ReadListener<Book>() {
            /**
             * 单次缓存的数据量
             */
            public static final int BATCH_COUNT = 100;
            /**
             *临时存储
             */
            private List<Book> cachedDataList = ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);

            @Override
            public void invoke(Book data, AnalysisContext context) {
                cachedDataList.add(data);
                if (cachedDataList.size() >= BATCH_COUNT) {
                    saveData();
                    // 存储完成清理 list
                    cachedDataList = ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);
                }
            }

            @Override
            public void doAfterAllAnalysed(AnalysisContext context) {
                saveData();
            }

            /**
             * 加上存储数据库
             */
            private void saveData() {
                log.info("{}条数据，开始存储数据库！", cachedDataList.size());
                log.info("存储数据库成功！");
                result.addAll(cachedDataList);
            }
        }).sheet().doRead();
        log.info("excel content {}", result);

        return "上传失败";
    }

    /**
     * 导出excel
     */
    @ResponseBody
    @GetMapping("/download")
    public String downloadFile(HttpServletResponse response) throws IOException {

        String fileName = "demo.xls";
        response.setContentType("application/force-download");
        // 设置文件名
        response.addHeader("Content-Disposition", "attachment;fileName=" + fileName);
        Book book = new Book();
        book.setId(1L);
        book.setName("tcoding");
        book.setPrice(1.23);
        book.setPushDate(new Date());

        EasyExcel.write(response.getOutputStream(), Book.class).sheet().doWrite(List.of(book, book, book, book, book, book, book));

        return "下载失败";
    }
}

