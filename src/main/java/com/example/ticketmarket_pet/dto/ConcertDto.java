package com.example.ticketmarket_pet.dto;

import com.example.ticketmarket_pet.entity.Artist;
import lombok.Value;

import java.util.Date;
import java.util.List;

@Value
public class ConcertDto {
     String concertID;
     String concertName;
     List<Artist> listOfArtists;
     String country;
     String city;
     String address;
     int countOfTickets;
     Date date;
}
