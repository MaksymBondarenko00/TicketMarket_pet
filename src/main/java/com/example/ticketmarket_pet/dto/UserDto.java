package com.example.ticketmarket_pet.dto;

import com.example.ticketmarket_pet.entity.Order;
import com.example.ticketmarket_pet.entity.Ticket;
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
    List<Ticket> userTickets;
    List<Order> orders;
    UserInfoDto userInfo;

}
