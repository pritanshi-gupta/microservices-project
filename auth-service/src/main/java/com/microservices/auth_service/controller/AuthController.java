package com.microservices.auth_service.controller;

import com.microservices.auth_service.entity.User;
import com.microservices.auth_service.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService service;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        return service.register(user);
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody User user) {

        String token = service.login(user.getUsername(), user.getPassword());

        Map<String, String> response = new HashMap<>();
        response.put("access_token", token);
        response.put("token_type", "Bearer");

        return response;
    }
}
