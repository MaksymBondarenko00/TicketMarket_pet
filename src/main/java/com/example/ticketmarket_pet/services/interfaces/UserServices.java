package com.example.ticketmarket_pet.services.interfaces;

import com.example.ticketmarket_pet.dto.UserDto;
import com.example.ticketmarket_pet.dto.UserInfoDto;
import com.example.ticketmarket_pet.entity.*;

import java.util.UUID;

public interface UserServices {
    // --- get(read) request --- //
    UserDto getUserById(String id);

    UserDto getUserByName(String firstName, String lastName);

    UserDto buyTicket(UUID ticketId, UUID userId);

    UserInfoDto getInfoByUsername(String username);

    // --- post(create) request --- //
//    User createUser(User user);

}
