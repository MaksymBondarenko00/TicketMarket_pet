package com.example.ticketmarket_pet.services.interfaces;

import com.example.ticketmarket_pet.entity.PromoCode;

import java.util.List;
import java.util.UUID;

public interface PromoCodeServices {
    PromoCode getPromoById(UUID id);
    List<PromoCode> getPromosByDiscount(int discount);
}
