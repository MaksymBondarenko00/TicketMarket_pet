package com.example.ticketmarket_pet.services.interfaces;

import com.example.ticketmarket_pet.entity.Order;
import com.example.ticketmarket_pet.entity.enums.PaymentMethod;

import java.util.List;
import java.util.UUID;

public interface OrderServices {
    Order getOrderByOrderId(UUID id);
    List<Order> getOrdersByCurrencyCodeAndPaymentMethod(String currencyCode, PaymentMethod paymentMethod);
}

