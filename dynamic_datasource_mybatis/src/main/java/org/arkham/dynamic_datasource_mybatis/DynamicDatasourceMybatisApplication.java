package org.arkham.dynamic_datasource_mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
@EnableTransactionManagement  // 开启事务
public class DynamicDatasourceMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicDatasourceMybatisApplication.class, args);
    }

}
