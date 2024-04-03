package com.example.ticketmarket_pet.controller;

import com.example.ticketmarket_pet.entity.Artist;
import com.example.ticketmarket_pet.services.interfaces.ArtistServices;
import com.example.ticketmarket_pet.validation.anotation.Uuid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/artist")
@RequiredArgsConstructor
public class ArtistController {
    private final ArtistServices artistServices;

    @GetMapping("/getArtist/{id}")
    public Artist showArtistById(@PathVariable(name = "id") String id) {
        return (artistServices.getArtistById(id));
    }

}
