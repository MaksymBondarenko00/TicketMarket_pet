package com.example.ticketmarket_pet.entity;

import com.example.ticketmarket_pet.entity.enums.EventType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "events")
@Getter
@Setter
public class Event {
    @Id
    @Column(name = "event_id")
    private UUID eventID;

    @OneToMany
    @Column(name = "lisr_of_concert")
    private List<Concert> listOfConcerts;

    @Column(name = "event_type")
    private EventType eventType;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(eventID, event.eventID) && Objects.equals(name, event.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventID, name);
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                '}';
    }
}
