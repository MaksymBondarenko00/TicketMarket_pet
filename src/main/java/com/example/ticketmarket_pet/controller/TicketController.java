package com.example.ticketmarket_pet.controller;

import com.example.ticketmarket_pet.entity.Ticket;
import com.example.ticketmarket_pet.entity.enums.AreaType;
import com.example.ticketmarket_pet.services.interfaces.TicketServices;
import com.example.ticketmarket_pet.validation.anotation.Uuid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@Validated
@RestController
@RequestMapping("/ticket")
@RequiredArgsConstructor
public class TicketController {

    private final TicketServices ticketServices;

    @GetMapping("/showTicket/{id}")
    public Ticket getTicketById(@PathVariable(name = "id") UUID id){
        return ticketServices.getTicketById(id);
    };

    @GetMapping("/by_type/{type}")
    public List<Ticket> getTicketByType(@PathVariable(name = "type") AreaType type){
        return ticketServices.getTicketsByAreaType(type);
    };
}

