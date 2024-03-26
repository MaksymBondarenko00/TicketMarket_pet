package com.example.ticketmarket_pet.controller;

import com.example.ticketmarket_pet.entity.*;
import com.example.ticketmarket_pet.services.interfaces.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
class UserController {

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

//    @PostMapping
//    public void createNewUser(
//            @RequestParam(name = "id") UUID id,
//            @RequestParam(name = "firstName") String firstName,
//            @RequestParam(name = "lastName") String lastName,
////            @RequestParam(name = "userTickets") List<Ticket> userTickets,
////            @RequestParam(name = "userOrders") List<Order> userOrders,
//            @RequestParam(name = "userInfo") UserInfo userInfo,
//            @RequestParam(name = "roles") Set<Role> roles,
//            @RequestParam(name = "isBlocked") boolean isBlocked,
//            @RequestParam(name = "createdAt") Timestamp createdAt) {
//userServices.createUser(id, firstName, lastName, createdAt, userInfo, roles, isBlocked);
////        return (new ResponseEntity<>(new User(id, firstName, lastName, userTickets, userOrders, createdAt, userInfo, roles, isBlocked), HttpStatus.CREATED)).getBody();
//    }


}
