package com.fortun.credman.user.controller;

import com.fortun.credman.user.model.entity.User;
import com.fortun.credman.user.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/credman")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAll() {
        return userService.findAll();
    }

    @GetMapping("/users/id/{id}")
    public User getById(@PathVariable Long id) {
        return this.userService.findById(id);
    }

    @GetMapping("/users/name/{name}")
    public User getByName(@PathVariable String name) {
        return this.userService.findByName(name);
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@ModelAttribute User user) {
        this.userService.save(user);
        return user;
    }

    @PutMapping("/users/id/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public User update(@ModelAttribute User user, @PathVariable Long id) {
        User currentUser = this.userService.findById(id);
        currentUser.setName(user.getName());
        currentUser.setPassword(user.getPassword());
        this.userService.save(currentUser);
        return currentUser;
    }

    @DeleteMapping("/users/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        this.userService.delete(id);
    }
}