package com.example.ticketmarket_pet.repository;

import com.example.ticketmarket_pet.entity.Ticket;
import com.example.ticketmarket_pet.entity.User;
import com.example.ticketmarket_pet.entity.enums.AreaType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, UUID> {
    Ticket findTicketByTickerID(UUID id);
    List<Ticket> getTicketsByAreaType(AreaType type);

}
