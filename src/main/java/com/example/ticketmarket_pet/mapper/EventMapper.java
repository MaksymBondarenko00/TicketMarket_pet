package com.example.ticketmarket_pet.mapper;

import com.example.ticketmarket_pet.dto.EventDto;
import com.example.ticketmarket_pet.entity.Event;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EventMapper {
    @Mapping(source = "event.listOfConcerts", target = "concerts")
    EventDto toDto(Event event);
//    Event dtoToEntity(EventDto eventDto);
//    List<EventDto> toDtoList(Event event);
}
