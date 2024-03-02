package com.example.ticketmarket_pet.entity;

import com.example.ticketmarket_pet.entity.enums.City;
import com.example.ticketmarket_pet.entity.enums.Country;
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
@Getter
@Setter
public class Concert {
    private UUID concertID;
    private Event eventName;
    private List<Artist> listOfArtists;
    private List<Date> datesOfConcerts;
    private Country country;
    private City city;
    private String address;
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
