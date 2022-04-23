package com.fortun.credman.user.model.service;

import com.fortun.credman.user.model.dao.UserDao;
import com.fortun.credman.user.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
        return (List<User>) userDao.findAll();
    }

    @Override
    @Transactional
    public User save(User user) {
        return userDao.save(user);
    }

    @Override
    @Transactional(readOnly = true)
    public User findById(Long id) {
        return userDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public User findByName(String name) {
        return userDao.findByName(name);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        userDao.deleteById(id);
    }
}