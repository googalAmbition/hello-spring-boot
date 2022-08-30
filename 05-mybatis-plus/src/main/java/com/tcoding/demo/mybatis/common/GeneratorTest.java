package com.tcoding.demo.mybatis.common;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;

import java.util.Collections;

/**
 * @author taylor
 * @date 2022/8/11.
 */
public class GeneratorTest {

    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://127.0.0.1:3306/hello_spring_boot?useUnicode=true&characterEncoding=UTF-8&useSSL=false",
            "root", "123456")
            .globalConfig(builder -> {
                builder.author("tc") // 设置作者
                    // .enableSwagger() // 开启 swagger 模式
                    .outputDir("./05-mybatis-plus/src/main/java"); // 指定输出目录
            })
            .packageConfig(builder -> {
                builder.parent("com.tcoding.demo.mybatis.mbg") // 设置父包名
                    // .moduleName("system") // 设置父包模块名
                    .pathInfo(Collections.singletonMap(OutputFile.xml, "./05-mybatis-plus/src/main/java")); // 设置mapperXml生成路径
            })
            .strategyConfig(builder -> {
                builder.addInclude("sys_user") // 设置需要生成的表名
                // .addTablePrefix("")
                ; // 设置过滤表前缀
            })
            // .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
            .execute();
    }
}

