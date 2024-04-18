package com.example.ticketmarket_pet.services.interfaces;

import com.example.ticketmarket_pet.entity.Concert;

import java.util.List;
import java.util.UUID;

public interface ConcertServices {
    Concert getConcertByConcertID(UUID id);
    List<Concert> getListOfConcertByCountry(String country);
}
