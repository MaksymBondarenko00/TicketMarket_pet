package com.example.ticketmarket_pet.dto;

import com.example.ticketmarket_pet.entity.Concert;
import com.example.ticketmarket_pet.entity.enums.EventType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Value;

import java.sql.Timestamp;
import java.util.List;

@Value
public class CreateEventDto {

    String name;

    EventType eventType;

    String description;
    String eventID;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Timestamp createdAt;
    int countOfTickets;
    List<Concert> listOfConcerts;
}
