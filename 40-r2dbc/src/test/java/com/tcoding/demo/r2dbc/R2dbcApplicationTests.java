package com.tcoding.demo.r2dbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest
@AutoConfigureWebTestClient
class R2dbcApplicationTests {

    @Autowired(required = false)
    private WebTestClient webTestClient;

    @Test
    void testGet() throws Exception {

        webTestClient.get().uri("/{id}", "1")
            .header(HttpHeaders.ACCEPT, "application/json")
            .exchange()
            .expectStatus().isOk()
            .expectBody()
            .jsonPath("$.name").isNotEmpty()
            .jsonPath("$.id").isEqualTo(1)
            .jsonPath("$.name").isEqualTo("aaaa");
    }
}
