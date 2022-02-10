package com.mf.bootstrap3.service;

import com.mf.bootstrap3.model.Role;
import com.mf.bootstrap3.model.User;

import java.util.List;


public interface UserService {

    User findUserByEmail(String email);

    User findUserByUserName(String userName);

    User saveUser(User user);

    Role saveRole(Role role);

    List<User> findAll();

    User getUserById(Long id);

    User update(User user);

    void deleteUser(Long id);

}
