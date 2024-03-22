package com.example.ticketmarket_pet.controller;

import com.example.ticketmarket_pet.entity.User;
import com.example.ticketmarket_pet.services.interfaces.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserServices userServices;

    @GetMapping("/showUser/{id}")
    public User showUserById(@PathVariable(name = "id") String id) {
        return userServices.getUserById(id);
    }
}
