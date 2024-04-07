package com.example.ticketmarket_pet.services.interfaces;

import com.example.ticketmarket_pet.dto.UserDto;
import com.example.ticketmarket_pet.dto.UserInfoDto;
import com.example.ticketmarket_pet.entity.*;

import java.util.UUID;

public interface UserServices {
    // --- get(read) request --- //
    UserDto getUserById(UUID id);

    UserDto getUserByName(String firstName, String lastName);

    UserInfoDto getInfoByUsername(String username);


    // --- post(create) request --- //
//    User createUser(User user);

}
