package org.arkham.dynamic_datasource.service;

import org.arkham.dynamic_datasource.entity.User;

import java.util.List;

public interface UserService {
    List<User> list();

    void save(User friend);

}
