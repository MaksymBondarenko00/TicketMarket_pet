package com.example.ticketmarket_pet.services.interfaces.impl;

import com.example.ticketmarket_pet.entity.Ticket;
import com.example.ticketmarket_pet.entity.enums.AreaType;
import com.example.ticketmarket_pet.repository.TicketRepository;
import com.example.ticketmarket_pet.services.interfaces.TicketServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TicketServicesImpl implements TicketServices {
    private final TicketRepository repository;
    @Override
    public Ticket getTicketById(UUID id) {
        return repository.findTicketByTickerID(id);
    }

    @Override
    public List<Ticket> getTicketsByAreaType(AreaType type) {
        return repository.getTicketsByAreaType(type);
    }
}
