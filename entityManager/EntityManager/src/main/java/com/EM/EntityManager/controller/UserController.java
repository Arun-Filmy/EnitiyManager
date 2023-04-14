package com.EM.EntityManager.controller;


import com.EM.EntityManager.entity.UserDetails;
import com.EM.EntityManager.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/PostUser")
    public ResponseEntity<UserDetails> createUser(@RequestBody UserDetails user) {
        userRepository.save(user);
        ResponseEntity<UserDetails> userResponseEntity = new ResponseEntity<>(user, HttpStatus.CREATED);
        return userResponseEntity;
    }

    @GetMapping("/GetUser")
    public List<UserDetails> getUsers() {
        return userRepository.findAll();
    }
}
