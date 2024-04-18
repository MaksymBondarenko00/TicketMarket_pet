package com.example.ticketmarket_pet.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class UserInfoDto {
    String username;
    String email;
    String phoneNumber;
    String country;
    String city;
}
