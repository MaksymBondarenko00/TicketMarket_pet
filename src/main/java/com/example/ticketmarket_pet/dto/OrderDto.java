package com.example.ticketmarket_pet.dto;

import com.example.ticketmarket_pet.entity.enums.PaymentMethod;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Value;

import java.sql.Timestamp;
import java.util.List;

@Value
public class OrderDto {
    String orderId;
    UserDto clientID;
    String orderCost;
    PaymentMethod paymentMethod;
    String currencyCode;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Timestamp createdAt;
    PromoCodeDto promocode;
    List<TicketDto> selectedTickets;
}

