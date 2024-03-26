package com.example.ticketmarket_pet.repository;

import com.example.ticketmarket_pet.entity.Event;
import com.example.ticketmarket_pet.entity.enums.EventType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface EventRepository extends JpaRepository<Event, UUID> {
    Event getEventByEventID(UUID id);
    List<Event> getEventsByEventType(EventType eventType);
}
