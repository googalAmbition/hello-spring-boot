package com.tcoding.demo.easyexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.util.ListUtils;
import com.tcoding.demo.easyexcel.excel.Book;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.util.Date;
import java.util.List;

/**
 * @author 陈天成
 * @date 2022/10/13.
 */
@Log4j2
public class EasyExcelTest {

    @Test
    public void path() {
        System.out.println(new ClassPathResource("/").getPath());
    }

    @Test
    public void creat() {
        File file = new File(new ClassPathResource("").getPath() + "demo.xls");

        Book book = new Book();
        book.setId(1L);
        book.setName("tcoding");
        book.setPrice(1.23);
        book.setPushDate(new Date());

        EasyExcel.write(file, Book.class).sheet().doWrite(List.of(book, book, book, book, book, book, book));
    }

    @Test
    public void read() {
        File file = new File(new ClassPathResource("").getPath() + "demo.xls");
        EasyExcel.read(file, Book.class, new ReadListener<Book>() {
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
            }
        }).sheet().doRead();
    }
}

