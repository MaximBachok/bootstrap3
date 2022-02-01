package com.mf.bootstrap3.db;


import com.mf.bootstrap3.model.Role;
import com.mf.bootstrap3.model.User;
import com.mf.bootstrap3.service.RoleService;
import com.mf.bootstrap3.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DataBaseInit {

    private final UserService userService;
    private final RoleService roleService;

    public DataBaseInit(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    private void addUsersInDB() {
        User admin = new User("root", "root", 99, "root");
        User user = new User("user", "user", 15, "user");
        Role adminRole = new Role("ADMIN");
        Role userRole = new Role("USER");
        roleService.addRole(adminRole);
        roleService.addRole(userRole);
        admin.setOneRole(adminRole);
        user.setOneRole(userRole);
        userService.addUser(admin);
        userService.addUser(user);
    }
}