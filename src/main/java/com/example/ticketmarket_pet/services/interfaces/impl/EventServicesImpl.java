package com.example.ticketmarket_pet.services.interfaces.impl;

import com.example.ticketmarket_pet.entity.Event;
import com.example.ticketmarket_pet.entity.enums.EventType;
import com.example.ticketmarket_pet.repository.EventRepository;
import com.example.ticketmarket_pet.services.interfaces.EventServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EventServicesImpl implements EventServices {
    private final EventRepository eventRepository;

    @Override
    public Event findEventById(UUID id) {
        return eventRepository.getEventByEventID(id);
    }

    @Override
    public List<Event> findEventByType(EventType type) {
        return eventRepository.getEventsByEventType(type);
    }
}
