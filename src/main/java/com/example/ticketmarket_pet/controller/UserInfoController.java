package com.example.ticketmarket_pet.controller;

import com.example.ticketmarket_pet.entity.UserInfo;
import com.example.ticketmarket_pet.services.interfaces.UserInfoServices;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserInfoController {
    private final UserInfoServices userInfoServices;

    @GetMapping("/showUserInfo/{username}")
    public UserInfo showInfoByUsername(@PathVariable(name = "username") String username) {
        return userInfoServices.getInfoByUsername(username);
    }


}
