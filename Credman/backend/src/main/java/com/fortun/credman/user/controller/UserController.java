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
    public List<User> index() {
        return userService.findAll();
    }

    @GetMapping("/users/id/{id}")
    public User show(@PathVariable Long id) {
        return this.userService.findById(id);
    }

    @GetMapping("/users/name/{nameUser}")
    public User show(@PathVariable String nameUser) {
        return this.userService.findByName(nameUser);
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
        currentUser.setNameUser(user.getNameUser());
        currentUser.setPasswordUser(user.getPasswordUser());
        this.userService.save(currentUser);
        return currentUser;
    }

    @DeleteMapping("/users/id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        this.userService.delete(id);
    }
}