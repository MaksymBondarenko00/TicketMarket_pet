package com.example.ticketmarket_pet.controller;

import com.example.ticketmarket_pet.entity.*;
import com.example.ticketmarket_pet.services.interfaces.UserInfoServices;
import com.example.ticketmarket_pet.services.interfaces.UserServices;
import com.example.ticketmarket_pet.validation.anotation.Uuid;
import jakarta.transaction.Transactional;
import jdk.jfr.ContentType;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNullApi;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Validated
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserServices userServices;

    @GetMapping("/showUser/{id}")
    public User showUserById(@PathVariable(name = "id") String id) {
        return userServices.getUserById(id);
    }

    @GetMapping("/showUser/{firstName}/{lastName}")
    public User showUserByName(@PathVariable(name = "firstName") String firstName,
                               @PathVariable(name = "lastName") String lastName) {
        return userServices.getUserByName(firstName, lastName);
    }

//    @Transactional
//    @PostMapping("/create")
//    public User createNewUser(@RequestBody User user){
//        return userServices.createUser(user);
//    }
}
