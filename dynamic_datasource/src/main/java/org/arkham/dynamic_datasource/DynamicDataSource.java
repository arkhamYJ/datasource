package org.arkham.dynamic_datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Component
@Primary
public class DynamicDataSource extends AbstractRoutingDataSource {

    // 当前使用的数据源标识
    public static ThreadLocal<String> name=new ThreadLocal<>();


    // 写
    @Autowired
    DataSource dataSource1;
    // 读
    @Autowired
    DataSource dataSource2;

    @Override
    protected Object determineCurrentLookupKey() {
        return name.get();
    }
    @Override
    public void afterPropertiesSet() {
        // 为targetDataSources初始化所有数据源
        Map<Object, Object> targetDataSources=new HashMap<>();
        targetDataSources.put("W",dataSource1);
        targetDataSources.put("R",dataSource2);

        super.setTargetDataSources(targetDataSources);

        // 为defaultTargetDataSource 设置默认的数据源
        super.setDefaultTargetDataSource(dataSource1);

        super.afterPropertiesSet();

    }

}
