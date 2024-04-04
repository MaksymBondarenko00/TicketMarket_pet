package com.example.ticketmarket_pet.services.interfaces;

import com.example.ticketmarket_pet.entity.Artist;

import java.util.UUID;

public interface ArtistServices {
    Artist getArtistById(String id);
    void deleteArtist(UUID id);
}
