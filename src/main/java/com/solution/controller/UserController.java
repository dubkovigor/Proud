package com.solution.controller;

import com.solution.dto.UserDto;
import com.solution.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResponseEntity<String> saveUser(@RequestBody UserDto userDto) {

        return ResponseEntity.ok("UserController");
    }
}
