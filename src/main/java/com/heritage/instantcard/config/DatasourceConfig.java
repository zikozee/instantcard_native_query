package com.heritage.instantcard.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class DatasourceConfig {

    @Value("${oracle.driver-class-name}")
    private String oracleDriverClassName;

    @Value("${oracle.url}")
    private String oracleDbUrl;

    @Value("${oracle.username}")
    private String oracleUserName;

    @Value("${oracle.password}")
    private String oraclePassword;

    @Value("${oracle.hibernate.dialect}")
    private String oracleDialect;


    @Bean(name = "oracle_db")
    public DataSource getSqlServerTemplate(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(oracleDriverClassName);
        dataSource.setUrl(oracleDbUrl);
        dataSource.setUsername(oracleUserName);
        dataSource.setPassword(oraclePassword);

        Properties props = new Properties();
        props.setProperty("hibernate.dialect", oracleDialect);

        dataSource.setConnectionProperties(props);

        return dataSource;
    }

    @Bean
    public JdbcTemplate getTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

}
