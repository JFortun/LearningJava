package com.fortun.credman.user.model.dao;

import com.fortun.credman.user.model.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Long> {

    User findByName(String name);
}