package com.example.ticketmarket_pet.controller;

import com.example.ticketmarket_pet.entity.Concert;
import com.example.ticketmarket_pet.services.interfaces.ConcertServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/concert")
@RequiredArgsConstructor
public class ConcertController {

    private final ConcertServices concertServices;

    @GetMapping("/get_concert/{id}")
    public Concert findConcertById(@PathVariable(name = "id") UUID id) {
        return concertServices.getConcertByConcertID(id);
    }

    @GetMapping("/in_country/{country}")
    public List<Concert> findConcertById(@PathVariable(name = "country") String country) {
        return concertServices.getListOfConcertByCountry(country);
    }
}