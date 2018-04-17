package com.versus.server.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.sql.DataSource;

@SpringBootConfiguration
@ComponentScan(basePackages = {"com.versus.server"})
public class AppConfig {

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:postgresql://localhost:5432/versServer?createDatabaseIfNotExist=true");
        builder.username("postgres");
        builder.password("root");
        return builder.build();
    }
}
