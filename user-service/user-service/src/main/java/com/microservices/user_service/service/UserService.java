package com.microservices.user_service.service;

import com.microservices.user_service.entity.User;
import com.microservices.user_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // SAVE USER
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // GET ALL USERS
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // GET USER BY ID
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    // DELETE USER
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}