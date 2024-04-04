package com.example.ticketmarket_pet.services.interfaces.impl;

import com.example.ticketmarket_pet.entity.Concert;
import com.example.ticketmarket_pet.repository.ConcertRepository;
import com.example.ticketmarket_pet.services.interfaces.ConcertServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ConcertServicesImpl implements ConcertServices {
    private final ConcertRepository concertRepository;
    @Override
    public Concert getConcertByConcertID(UUID id) {
        return concertRepository.findByConcertID(id);
    }

    @Override
    public List<Concert> getListOfConcertByCountry(String country) {
        return concertRepository.findConcertsByCountry(country);
    }

    @Override
    public Concert updateConcert(UUID concertId) {
        Concert concert = getConcertByConcertID(concertId);
        concert.setCountOfTickets(concert.getCountOfTickets() + 50);
        return concertRepository.save(concert);
    }

}
