package com.example.ticketmarket_pet.dto;

import com.example.ticketmarket_pet.entity.enums.EventType;
import lombok.Value;

@Value
public class CreateEventDto {

    String name;

    EventType eventType;

    String description;
}
