package com.example.ticketmarket_pet.services.interfaces;

import com.example.ticketmarket_pet.entity.Ticket;
import com.example.ticketmarket_pet.entity.User;
import com.example.ticketmarket_pet.entity.enums.AreaType;

import java.util.List;
import java.util.UUID;

public interface TicketServices {
    Ticket getTicketById(UUID id);
    List<Ticket> getTicketsByAreaType(AreaType type);

}
