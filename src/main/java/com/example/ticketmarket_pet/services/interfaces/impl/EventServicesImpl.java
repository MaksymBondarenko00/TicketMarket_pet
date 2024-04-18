package com.example.ticketmarket_pet.services.interfaces.impl;

import com.example.ticketmarket_pet.dto.CreateEventDto;
import com.example.ticketmarket_pet.dto.EventAfterCreatingDto;
import com.example.ticketmarket_pet.entity.Event;
import com.example.ticketmarket_pet.entity.enums.EventType;
import com.example.ticketmarket_pet.mapper.CreateEventMapper;
import com.example.ticketmarket_pet.mapper.EventMapper;
import com.example.ticketmarket_pet.repository.EventRepository;
import com.example.ticketmarket_pet.services.interfaces.EventServices;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EventServicesImpl implements EventServices {
    private final EventRepository eventRepository;
    private final EventMapper mapper;
    private final CreateEventMapper createEventMapper;

    @Override
    public Event findEventById(UUID id) {
        return eventRepository.getEventByEventID(id);
    }

    @Override
    public List<Event> findEventByType(EventType type) {
        return eventRepository.getEventsByEventType(type);
    }

    @Override
    @Transactional
    public EventAfterCreatingDto createEvent(CreateEventDto createEventDto) {
        Event event = createEventMapper.dtoToEntity(createEventDto);
        event.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        eventRepository.saveAndFlush(event);
        return createEventMapper.toDto(event);
    }
}
