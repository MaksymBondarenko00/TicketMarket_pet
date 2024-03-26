package com.example.ticketmarket_pet.services.interfaces;

import com.example.ticketmarket_pet.entity.Event;
import com.example.ticketmarket_pet.entity.enums.EventType;

import java.util.List;
import java.util.UUID;

public interface EventServices {
    Event findEventById(UUID id);
    List<Event> findEventByType(EventType type);
}
