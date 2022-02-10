package com.mf.bootstrap3.db;


import com.mf.bootstrap3.model.Role;
import com.mf.bootstrap3.model.User;
import com.mf.bootstrap3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.HashSet;

@Component
public class DataBaseInit {

    private UserRepository userRepository;

    @Autowired
    public DataBaseInit(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void initDB() {
        if (userRepository.findByUserName("admin") == null) {
            userRepository.save(new User
                    (1L, "admin", "admin", (byte) 25,
                            "admin@admin.com", "admin",
                            true, new HashSet<>(Collections.singleton(new Role("ADMIN")))));
        }
    }
}