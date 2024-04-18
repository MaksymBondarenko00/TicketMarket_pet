package com.example.ticketmarket_pet.mapper;

import org.mapstruct.Mapper;

import java.util.UUID;

@Mapper(componentModel = "spring")
public interface UUIDMapper {

    default String toString(UUID uuid) {
        return uuid.toString();
    }

}
