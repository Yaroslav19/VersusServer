package com.versus.server.controller;

import com.versus.server.dao.entity.User;
import com.versus.server.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping
    public ModelAndView getAllUsers() {
        List<User> userList = userService.getAll();
        return new ModelAndView("userList", "users", userList);
    }

    @GetMapping(value = "/{id}")
    public User getUser(@PathVariable("id") Long userId) {
        return userService.getByID(userId);
    }

    @PostMapping
    public void saveUser(@RequestBody User user) {
        userService.save(user);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long userId) {
        userService.remove(userId);
    }
}
