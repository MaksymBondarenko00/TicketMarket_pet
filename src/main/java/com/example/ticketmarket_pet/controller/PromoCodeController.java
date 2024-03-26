package com.example.ticketmarket_pet.controller;

import com.example.ticketmarket_pet.entity.PromoCode;
import com.example.ticketmarket_pet.services.interfaces.PromoCodeServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/promo")
@RequiredArgsConstructor
public class PromoCodeController {

    private final PromoCodeServices services;

    @GetMapping("/get_promo/{id}")
    public PromoCode getPromoById(@PathVariable(name = "id") UUID id){
        return services.getPromoById(id);
    }

    @GetMapping("/by_discount/{discount}")
    public List<PromoCode> getPromosByDiscount(@PathVariable(name = "discount") int discount){
        return services.getPromosByDiscount(discount);
    }
}
