package com.example.ticketmarket_pet.dto;

import com.example.ticketmarket_pet.entity.enums.ArtistRole;

import lombok.Value;

@Value
public class ArtistDto {
    String artistID;
    String name;
    ArtistRole role;
}
