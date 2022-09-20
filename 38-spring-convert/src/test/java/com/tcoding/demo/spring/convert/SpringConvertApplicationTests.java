package com.tcoding.demo.spring.convert;

import com.tcoding.demo.spring.convert.modle.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.convert.ConversionService;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc
class SpringConvertApplicationTests {

    @Autowired
    ConversionService conversionService;

    @Autowired(required = false)
    MockMvc mockMvc;

    @Test
    void contextLoads() {
        Assertions.assertEquals(conversionService.convert("25", Integer.class), 25);
        Assertions.assertEquals(conversionService.convert("25", Long.class), 25L);
        Assertions.assertEquals(conversionService.convert("2.5", Float.class), 2.5F);
    }

    @Test
    void convertTest(){
        Book book = conversionService.convert("1,tcoding", Book.class);
        Assertions.assertEquals(book.getId(),1L);
        Assertions.assertEquals(book.getName(),"tcoding");
    }

    @Test
    void testMvc() throws Exception {
       mockMvc.perform(get("/book?book=1,tcoding"))
           .andDo(print())
           .andExpect(jsonPath("$.id").value(1L))
           .andExpect(jsonPath("$.name").value("tcoding"));
    }

}
