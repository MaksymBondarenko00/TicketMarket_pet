package com.example.ticketmarket_pet.repository;

import com.example.ticketmarket_pet.entity.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, UUID> {
    Artist findArtistByArtistID(UUID id);

}
