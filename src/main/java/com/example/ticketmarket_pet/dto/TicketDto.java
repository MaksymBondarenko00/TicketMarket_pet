package com.example.ticketmarket_pet.dto;

import com.example.ticketmarket_pet.entity.Event;
import com.example.ticketmarket_pet.entity.User;
import com.example.ticketmarket_pet.entity.enums.AreaType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Value;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
public class TicketDto {
    EventDto eventDto;
    BigDecimal price;
    BigDecimal servicePayments;
    AreaType areaType;
}
