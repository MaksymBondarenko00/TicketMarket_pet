package com.example.ticketmarket_pet.controller;

import com.example.ticketmarket_pet.entity.Artist;
import com.example.ticketmarket_pet.services.interfaces.ArtistServices;
import com.example.ticketmarket_pet.validation.anotation.Uuid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

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

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteArtist(@PathVariable(name = "id")UUID id){
        artistServices.deleteArtist(id);
        return ResponseEntity.ok("***Deleted successfully!***");
    }
}
