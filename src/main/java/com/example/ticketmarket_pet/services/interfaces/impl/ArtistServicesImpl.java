package com.example.ticketmarket_pet.services.interfaces.impl;

import com.example.ticketmarket_pet.entity.Artist;
import com.example.ticketmarket_pet.repository.ArtistRepository;

import com.example.ticketmarket_pet.services.interfaces.ArtistServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ArtistServicesImpl implements ArtistServices {
    private final ArtistRepository artistRepository;

    @Override
    public Artist getArtistById(String id) {
        return(artistRepository.findArtistByArtistID(UUID.fromString(id)));
    }

    @Override
    public void deleteArtist(UUID id) {
        Artist artist = getArtistById(String.valueOf(id));
        artistRepository.delete(artist);
    }
}
