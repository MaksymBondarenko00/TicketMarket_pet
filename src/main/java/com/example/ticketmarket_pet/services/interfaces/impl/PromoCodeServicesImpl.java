package com.example.ticketmarket_pet.services.interfaces.impl;

import com.example.ticketmarket_pet.entity.PromoCode;
import com.example.ticketmarket_pet.repository.PromoCodeRepository;
import com.example.ticketmarket_pet.services.interfaces.PromoCodeServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PromoCodeServicesImpl implements PromoCodeServices {
    private final PromoCodeRepository repository;
    @Override
    public PromoCode getPromoById(UUID id) {
        return repository.findPromoByPromoId(id);
    }

    @Override
    public List<PromoCode> getPromosByDiscount(int discount) {
        return repository.findPromosByDiscountPercentage(discount);
    }
}
