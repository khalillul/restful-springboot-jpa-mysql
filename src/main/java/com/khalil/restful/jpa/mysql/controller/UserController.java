package com.khalil.restful.jpa.mysql.controller;

import com.khalil.restful.jpa.mysql.model.User;
import com.khalil.restful.jpa.mysql.repository.UserRepository;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository repository;

    @CrossOrigin
    @GetMapping("/")
    public List<User> getAll(){
        return repository.findAll();
    }

    @CrossOrigin
    @PostMapping("/")
    public @ResponseBody User addUser(@Valid @RequestBody User user) {
        return repository.save(user);
    }

}
