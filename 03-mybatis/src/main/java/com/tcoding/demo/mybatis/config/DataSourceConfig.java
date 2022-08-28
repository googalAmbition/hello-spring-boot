package com.tcoding.demo.mybatis.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author tc
 * @date 2022/8/27.
 */
@Configuration
public class DataSourceConfig {

    @Primary
    @Bean("db1")
    @ConfigurationProperties(prefix = "spring.datasource.db1")
    public DataSourceProperties db1() {
        return new DataSourceProperties();
    }

    @Primary
    @Bean
    public DataSource dataSource1(@Qualifier("db1") DataSourceProperties dataSourceProperties) {
        return dataSourceProperties.initializeDataSourceBuilder().build();
    }

    @Bean("db2")
    @ConfigurationProperties(prefix = "spring.datasource.db2")
    public DataSourceProperties db2() {
        return new DataSourceProperties();
    }

    @Bean
    public DataSource dataSource2(@Qualifier("db2") DataSourceProperties dataSourceProperties) {
        return dataSourceProperties.initializeDataSourceBuilder().build();
    }
}

