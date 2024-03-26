package com.example.ticketmarket_pet.controller;

import com.example.ticketmarket_pet.entity.Order;
import com.example.ticketmarket_pet.entity.enums.PaymentMethod;
import com.example.ticketmarket_pet.services.interfaces.OrderServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderServices orderServices;

    @GetMapping("/get_order/{id}")
    public Order getOrderById(@PathVariable(name = "id") UUID id){
        return orderServices.getOrderByOrderId(id);
    }

    @GetMapping("/by_currency/{currency}/and_payment_method/{paymentMethod}")
    public List<Order> ordersByCurrencyCodeAndPaymentMethod(@PathVariable(name = "currency") String currency,
                                                               @PathVariable(name = "paymentMethod")PaymentMethod paymentMethod){
        return orderServices.getOrdersByCurrencyCodeAndPaymentMethod(currency, paymentMethod);
    }
}
