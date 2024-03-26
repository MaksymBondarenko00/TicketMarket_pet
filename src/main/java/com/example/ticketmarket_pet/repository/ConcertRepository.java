package com.example.ticketmarket_pet.repository;

import com.example.ticketmarket_pet.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ConcertRepository extends JpaRepository<Concert, UUID> {
    Concert findByConcertID(UUID id);

    List<Concert> findConcertsByCountry(String country);

}
