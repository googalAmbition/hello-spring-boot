package com.tcoding.demo.elasticsearch.config;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.convert.ElasticsearchConverter;

/**
 * @author 陈天成
 * @date 2022/9/6.
 */
@Configuration
public class ElasticsearchConfig {

    // @Bean
    // public ElasticsearchTemplate elasticsearchTemplate(ElasticsearchClient client, ElasticsearchConverter elasticsearchConverter) {
    //     return new ElasticsearchTemplate(client, elasticsearchConverter);
    // }
}

