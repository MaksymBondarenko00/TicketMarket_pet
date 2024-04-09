package com.example.ticketmarket_pet.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "concerts")
@Getter
@Setter
public class Concert {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "concert_id")
    private UUID concertID;


    @Column(name = "concert_name")
    private String concertName;

    @OneToMany
    @JoinColumn(name = "artist_id")
    private List<Artist> listOfArtists;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "address")
    private String address;

    @Column(name = "tickets_count")
    private int countOfTickets;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(name = "date", nullable = false)
    private Date date;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Concert concert = (Concert) o;
        return Objects.equals(concertID, concert.concertID) && Objects.equals(concertName, concert.concertName) && country == concert.country && city == concert.city;
    }

    @Override
    public int hashCode() {
        return Objects.hash(concertID, concertName, country, city);
    }

    @Override
    public String toString() {
        return "Concert{" +
                "eventName=" + concertName +
                ", listOfArtists=" + listOfArtists +
                ", country=" + country +
                ", city=" + city +
                ", address='" + address + '\'' +
                '}';
    }

}
