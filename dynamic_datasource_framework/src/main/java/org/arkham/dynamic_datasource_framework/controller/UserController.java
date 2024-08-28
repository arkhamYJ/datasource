package org.arkham.dynamic_datasource_framework.controller;

import com.baomidou.dynamic.datasource.DynamicRoutingDataSource;
import lombok.extern.slf4j.Slf4j;
import org.arkham.dynamic_datasource_framework.entity.User;
import org.arkham.dynamic_datasource_framework.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;

@RestController
@RequestMapping("user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "select")
    public List<User> select(){
        return userService.list();
    }


    @GetMapping(value = "insert")
    public void in(){
        User user = new User();
        user.setId(8475834L);
        user.setName("xman");
        userService.save(user);
    }

    @Autowired
    private DataSource dataSource;

    @GetMapping("ds/des")
    public Object remove(String name) {
        DynamicRoutingDataSource ds = (DynamicRoutingDataSource) dataSource;

        ds.getDataSources().forEach((s,datasource) -> {
            System.out.println(datasource);
        });

        return "后台查看当前数据源信息";
    }
}
