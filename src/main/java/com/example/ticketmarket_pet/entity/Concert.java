package com.example.ticketmarket_pet.entity;

import com.example.ticketmarket_pet.entity.enums.City;
import com.example.ticketmarket_pet.entity.enums.Country;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "concerts")
@Getter
@Setter
public class Concert {
    @Id
    @Column(name = "concert_id")
    private UUID concertID;

    @OneToOne
    @Column(name = "event_name")
    private Event eventName;

    @OneToMany
    @Column(name = "list_of_artist")
    private List<Artist> listOfArtists;

    @ElementCollection
    @Column(name = "dates_of_concerts")
    private List<Date> datesOfConcerts;

    @Column(name = "country")
    private Country country;

    @Column(name = "city")
    private City city;

    @Column(name = "address")
    private String address;

    @Column(name = "count_of_tickets")
    private int countOfTickets;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Concert concert = (Concert) o;
        return Objects.equals(concertID, concert.concertID) && Objects.equals(eventName, concert.eventName) && country == concert.country && city == concert.city;
    }

    @Override
    public int hashCode() {
        return Objects.hash(concertID, eventName, country, city);
    }

    @Override
    public String toString() {
        return "Concert{" +
                "eventName=" + eventName +
                ", listOfArtists=" + listOfArtists +
                ", country=" + country +
                ", city=" + city +
                ", address='" + address + '\'' +
                '}';
    }
}
