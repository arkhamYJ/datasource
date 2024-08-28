package org.arkham.dynamic_datasource.aspect;

import org.arkham.dynamic_datasource.DynamicDataSource;
import org.arkham.dynamic_datasource.annotation.WR;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DynamicDataSourceAspect implements Ordered {

    // 前置
    @Before("within(org.arkham.dynamic_datasource.service.impl.*) && @annotation(wr)")
    public void before(JoinPoint point, WR wr){
        String name = wr.value();
        DynamicDataSource.name.set(name);

        System.out.println(name);
    }

    @Override
    public int getOrder() {
        return 0;
    }

    // 环绕通知
}
