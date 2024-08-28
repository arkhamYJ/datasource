package org.arkham.dynamic_datasource.controller;

import lombok.extern.slf4j.Slf4j;
import org.arkham.dynamic_datasource.entity.User;
import org.arkham.dynamic_datasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public String insert(){
        User user = new User();
        user.setId(21448576L);
        user.setName("arkham111");
        userService.save(user);
        return "data added";
    }

}
