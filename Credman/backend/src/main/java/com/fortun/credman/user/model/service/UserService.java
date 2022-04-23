package com.fortun.credman.user.model.service;

import com.fortun.credman.user.model.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User save(User user);

    User findById(Long id);

    User findByName(String name);

    void delete(Long id);
}