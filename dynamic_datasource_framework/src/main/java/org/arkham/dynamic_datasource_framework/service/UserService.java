package org.arkham.dynamic_datasource_framework.service;

import org.arkham.dynamic_datasource_framework.entity.User;

import java.util.List;

public interface UserService {
    List<User> list();

    void save(User friend);

}
