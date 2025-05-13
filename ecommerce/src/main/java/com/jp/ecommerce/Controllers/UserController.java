package com.jp.ecommerce.Controllers;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jp.ecommerce.entities.User;
import com.jp.ecommerce.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public User create(@RequestBody User user) {
        user.setCreatedAt(LocalDateTime.now());
        return userRepository.save(user);
    }
}
