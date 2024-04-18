package com.example.ticketmarket_pet.dto;

import com.example.ticketmarket_pet.entity.UserInfo;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Value;

import java.sql.Timestamp;

@Value
public class CreateUserDto {
    //User
    String userId;
    String firstName;
    String lastName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Timestamp createdAt;
    boolean isBlocked;
    UserInfo userInfo;
}
