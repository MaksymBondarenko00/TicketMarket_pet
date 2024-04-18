package com.example.ticketmarket_pet.mapper;

import com.example.ticketmarket_pet.dto.TicketDto;
import com.example.ticketmarket_pet.entity.Ticket;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TicketMapper {
    @Mapping(target = "eventDto",source = "ticket.event")
    TicketDto toDto(Ticket ticket);
}
