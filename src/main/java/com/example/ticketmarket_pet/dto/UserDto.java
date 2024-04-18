package com.example.ticketmarket_pet.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
public class UserDto {
    String userID;
    String firstName;
    String lastName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Timestamp createdAt;
    boolean isBlocked;
    List<TicketDto> tickets;
    UserInfoDto userInfoDto;

}
