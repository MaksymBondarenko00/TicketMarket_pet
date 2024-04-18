package com.example.ticketmarket_pet.dto;

import lombok.Value;

import java.util.List;

@Value
public class EventDto {
    String name;
    List<ConcertDto> concerts;
}
