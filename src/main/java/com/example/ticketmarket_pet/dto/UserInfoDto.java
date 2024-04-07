package com.example.ticketmarket_pet.dto;

import com.example.ticketmarket_pet.entity.Role;
import jakarta.persistence.Transient;
import jakarta.transaction.Transactional;
import lombok.Value;

import java.util.Set;
import java.util.UUID;

@Value
public class UserInfoDto {
    UUID userInfoId;
    String username;
    String email;
    String phoneNumber;
    String cardNumber;
    String country;
    String city;
    String password;
}
