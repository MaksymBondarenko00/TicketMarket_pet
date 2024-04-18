package com.example.ticketmarket_pet.controller;

import com.example.ticketmarket_pet.entity.Concert;
import com.example.ticketmarket_pet.services.interfaces.ConcertServices;
import com.example.ticketmarket_pet.validation.anotation.Uuid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
@Validated
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
    public List<Concert> findConcertByCountry(@PathVariable(name = "country") String country) {
        return concertServices.getListOfConcertByCountry(country);
    }


}