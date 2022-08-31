package com.tcoding.demo.helloworld.controller;

import com.tcoding.demo.helloworld.HelloWorldApplicationTests;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @author 陈天成
 * @date 2022/8/27.
 */
@AutoConfigureMockMvc
class HelloWorldControllerTest extends HelloWorldApplicationTests {

    @Autowired(required = false)
    private MockMvc mockMvc;

    @Test
    void get() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/get"))
            .andExpect(MockMvcResultMatchers.jsonPath("code").value(0))
            .andDo(MockMvcResultHandlers.print());
    }

    @Test
    void exception() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/exception"))
            .andExpect(MockMvcResultMatchers.jsonPath("code").value(1))
            .andDo(MockMvcResultHandlers.print());
    }
}