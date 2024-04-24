package com.example.ticketmarket_pet.dto;

import com.example.ticketmarket_pet.entity.Role;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@RequiredArgsConstructor
@Data
public class UserInfoDto {
    String userInfoId;
    String username;
    String email;
    String phoneNumber;
    String cardNumber;
    String password;
    String country;
    String city;
    Set<Role> roles;
}
