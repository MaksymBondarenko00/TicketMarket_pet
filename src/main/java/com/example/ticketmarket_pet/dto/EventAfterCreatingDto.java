package com.example.ticketmarket_pet.dto;


import com.example.ticketmarket_pet.entity.Concert;
import com.example.ticketmarket_pet.entity.enums.EventType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;



import java.sql.Timestamp;
import java.util.List;


@Data
public class EventAfterCreatingDto {

    String eventID;

    String name;

    EventType eventType;

    String description;

    List<Concert> listOfConcerts;

    int countOfTickets;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Timestamp createdAt;
}
