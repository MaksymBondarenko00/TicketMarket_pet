package com.example.ticketmarket_pet.dto;

import lombok.Data;

@Data
public class UserBeforeRegistrationDto {
    /**
     * User.class
     */
    String firstName;
    String secondName;
    String country;

    /**
     * UserInfo.class
     */
    String email;
}
