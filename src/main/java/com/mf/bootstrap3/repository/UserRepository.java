package com.mf.bootstrap3.repository;

import com.mf.bootstrap3.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findAll();
    User findUserByName(String name);
    User findUserById(Long id);
}
