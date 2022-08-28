package com.tcoding.demo.mybatis.config;

import com.tcoding.demo.mybatis.config.annotation.Db1;
import com.tcoding.demo.mybatis.mbg.handler.EncryptTypeHandler;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @author tc
 * @date 2022/8/27.
 */
@Configuration
@MapperScan(
    basePackages = "com.tcoding.demo.mybatis.mbg.mapper1",
    annotationClass = Db1.class, sqlSessionTemplateRef =
    "sqlSessionTemplate1")
public class MybatisConfigDb1 {

    @Primary
    @Bean
    public SqlSessionFactory db1SqlSessionFactory1(@Qualifier("dataSource1") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/db1/*.xml"));
        sqlSessionFactoryBean.setTypeHandlers(new EncryptTypeHandler());
        return sqlSessionFactoryBean.getObject();
    }

    @Primary
    @Bean
    public DataSourceTransactionManager transactionManager1(@Qualifier("dataSource1") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Primary
    @Bean("sqlSessionTemplate1")
    public SqlSessionTemplate sqlSessionTemplate1(@Qualifier("db1SqlSessionFactory1") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}

