package com.example.ticketmarket_pet.dto;

import com.example.ticketmarket_pet.entity.UserInfo;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Value;

import java.sql.Timestamp;
import java.util.UUID;

@Value
public class  UserDto {
    UUID userID;
    String firstName;
    String lastName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Timestamp createdAt;
    boolean isBlocked;
    UserInfo userInfo;
}
