package com.example.ticketmarket_pet.dto;

import com.example.ticketmarket_pet.entity.Artist;
import lombok.Value;

import java.util.Date;
import java.util.List;

@Value
public class ConcertDto {
     String concertName;
     String country;
     String city;
     String address;
     Date date;
}
