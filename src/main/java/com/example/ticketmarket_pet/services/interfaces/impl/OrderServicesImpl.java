package com.example.ticketmarket_pet.services.interfaces.impl;

import com.example.ticketmarket_pet.entity.Order;
import com.example.ticketmarket_pet.entity.enums.PaymentMethod;
import com.example.ticketmarket_pet.repository.OrderRepository;
import com.example.ticketmarket_pet.services.interfaces.OrderServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderServicesImpl implements OrderServices {

    private final OrderRepository orderRepository;

    @Override
    public Order getOrderByOrderId(UUID id) {
        return orderRepository.getOrderByOrderId(id);
    }

    @Override
    public List<Order> getOrdersByCurrencyCodeAndPaymentMethod(String currencyCode, PaymentMethod paymentMethod) {
        return orderRepository.getOrdersByCurrencyCodeAndPaymentMethod(currencyCode, paymentMethod);
    }
}
