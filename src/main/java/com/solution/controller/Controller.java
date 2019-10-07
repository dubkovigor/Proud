package com.solution.controller;

import com.solution.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lol")
public class Controller {

    @Autowired
    UserService userService;

    @GetMapping
    public String fff() {
        return userService.getGit();
    }
}
