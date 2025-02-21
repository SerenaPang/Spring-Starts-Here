package com.ch13.transaction;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/***
 * To connect to the database in JDBC template is different from Spring boot
 * */
@Configuration
public class SpringJdbcConfig {
    @Bean
    public DataSource mysqlDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/accounts");
        dataSource.setUsername("root");
        dataSource.setPassword("abcd1234.");

        return dataSource;
    }
}