package com.backend.backend.database;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

public class JpaConfig {
    @Bean(name = "MySqlDataSource")
    @Primary
    public DataSource MySqlDataSource()
    {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:mysql://localhost:3306/db_spring?serverTimezone=UTC");
        dataSourceBuilder.username("root");
        dataSourceBuilder.password("80322329");
        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
        return dataSourceBuilder.build();
    }
}
