package com.example.ticketmarket_pet.controller;

import com.example.ticketmarket_pet.entity.Event;
import com.example.ticketmarket_pet.entity.enums.EventType;
import com.example.ticketmarket_pet.services.interfaces.EventServices;
import com.example.ticketmarket_pet.validation.anotation.Uuid;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Validated
@RestController
@RequestMapping("/event")
@RequiredArgsConstructor
public class EventController {


    private final EventServices eventServices;

    @GetMapping("/get_event/{id}")
    public Event getEventById(@PathVariable(name = "id")UUID id){
        return eventServices.findEventById(id);
    }

    @GetMapping("/by_type/{type}")
    public List<Event> getEventsByType(@PathVariable(name = "type") EventType type){
        return eventServices.findEventByType(type);
    }

    @Transactional
    @PostMapping("/create")
    public Event createEvent(@RequestBody Event event){
        return eventServices.createEvent(event);
    }
}
