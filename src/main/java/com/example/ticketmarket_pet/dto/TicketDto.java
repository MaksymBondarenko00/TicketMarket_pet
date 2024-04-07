package com.example.ticketmarket_pet.dto;

import com.example.ticketmarket_pet.entity.Event;
import com.example.ticketmarket_pet.entity.User;
import com.example.ticketmarket_pet.entity.enums.AreaType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Value;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Value
public class TicketDto {
    String tickerID;
    Event event;
    User participantID;
    BigDecimal price;
    BigDecimal servicePayments;
    AreaType areaType;
    boolean hasBought;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Timestamp createdAt;
}
