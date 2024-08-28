package org.arkham.dynamic_datasource_framework;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.arkham.dynamic_datasource_framework.mapper")
public class DynamicDatasourceFrameworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicDatasourceFrameworkApplication.class, args);
    }

}
