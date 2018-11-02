package com.cmbchina.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
public class MybatisConfig {

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.yummy")
    public DataSource dataSourceYummy() {
        return new DruidDataSource();
    }


    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryYummy2(@Qualifier("dataSourceYummy") DataSource dataSourceYummy, ResourcePatternResolver resolver) throws IOException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSourceYummy);
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:mybatis/mapper/gen/*.xml"));
        sqlSessionFactoryBean.setConfigLocation(resolver.getResource("classpath:mybatis.xml"));
        return sqlSessionFactoryBean;
    }


    @Bean
    public MapperScannerConfigurer mapperScannerConfigurerYummy2() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.cmbchina.dao.mapper.gen");
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactoryYummy2");
        return mapperScannerConfigurer;
    }



}
