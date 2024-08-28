package org.arkham.dynamic_datasource_mybatis.controller;

import lombok.extern.slf4j.Slf4j;
import org.arkham.dynamic_datasource_mybatis.entity.User;
import org.arkham.dynamic_datasource_mybatis.service.UserService;
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
        user.setId(1341123114l);
        user.setName("lxman");
        userService.saveR(user);
        return "data added";
    }


//    @GetMapping(value = "save")
//    public void save() throws Exception {
//        Friend friend = new Friend();
//        friend.setName("loulan");
//        friendService.saveAll(friend);
//    }
}
