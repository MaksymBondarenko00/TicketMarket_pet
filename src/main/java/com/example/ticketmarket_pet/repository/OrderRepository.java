package com.example.ticketmarket_pet.repository;

import com.example.ticketmarket_pet.entity.Order;
import com.example.ticketmarket_pet.entity.enums.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface OrderRepository extends JpaRepository<Order, UUID> {
    Order getOrderByOrderId(UUID id);
    List<Order> getOrdersByCurrencyCodeAndPaymentMethod(String currencyCode, PaymentMethod paymentMethod);
}
