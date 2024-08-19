package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.repository.UserRepository;
import com.user.User;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class UserController {
    
    @Autowired
    private  UserRepository repository;

    @GetMapping("/user")
    public List<User> getUserAll() {
        return repository.findAll();
    }

    @PostMapping("/user")
    public void postUser (@RequestBody User username) {
        repository.save(username);
    }
    
    @PutMapping("/user")
    public void put (@RequestBody User username) {
        repository.update(username);
    }

    @GetMapping("/user/{name}")
    public String getUser (@PathVariable ("name") String username) {
        return repository.findByUsername(username);
    }
    
    @GetMapping("/usuarios/{id}")
    public User getOne (@PathVariable ("id") Integer userId) {

        return repository.finById(userId);
    }

    @DeleteMapping("/usuarios/{id}")
    public void delete (@PathVariable ("id") Integer userId){

        repository.deleteById(userId);
    }
}
