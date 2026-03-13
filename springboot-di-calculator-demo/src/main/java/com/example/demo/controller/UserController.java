package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final User user;

    public UserController(User user) {
        this.user = user;
    }

    @GetMapping("/calculate")
    public int calculate() {

        return user.performCalculation(5, 3);

    }
}
