package com.example.ticketmarket_pet.services.interfaces;

import com.example.ticketmarket_pet.entity.*;

public interface UserServices {
    // --- get(read) request --- //
    User getUserById(String id);

    User getUserByName(String firstName, String lastName);

    // --- post(create) request --- //
//    User createUser(User user);

}
