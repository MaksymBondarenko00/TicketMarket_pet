package com.example.ticketmarket_pet.mapper;

import com.example.ticketmarket_pet.dto.CreateEventDto;
import com.example.ticketmarket_pet.dto.EventAfterCreatingDto;
import com.example.ticketmarket_pet.entity.Event;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.sql.Timestamp;
import java.util.ArrayList;

@Mapper(componentModel = "spring", imports = {Timestamp.class, ArrayList.class})
public interface CreateEventMapper {
    @Mapping(source = "event.eventID", target = "eventID")
    @Mapping(source = "event.name", target = "name")
    @Mapping(source = "event.description", target = "description")
    @Mapping(source = "event.eventType", target = "eventType")
    @Mapping(target = "countOfTickets", ignore = true)
    @Mapping(expression = "java(new ArrayList<>())", target = "listOfConcerts")
    @Mapping(expression = "java(new Timestamp(System.currentTimeMillis()))", target = "createdAt")
    EventAfterCreatingDto toDto(Event event);

    @AfterMapping
    default void toDto(EventAfterCreatingDto eventAfterCreatingDto){
        eventAfterCreatingDto.setCountOfTickets(150);
    }

    Event dtoToEntity(CreateEventDto createEventDto);
}
