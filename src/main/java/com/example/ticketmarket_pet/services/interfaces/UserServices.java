package com.example.ticketmarket_pet.services.interfaces;

import com.example.ticketmarket_pet.entity.*;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface UserServices {
    // --- get(read) request --- //
    User getUserById(String id);

    User getUserByName(String firstName, String lastName);

    // --- post(create) request --- //
//    void createUser(UUID id, String firstName, String lastName, Timestamp createdAt, UserInfo userInfo, Set<Role> roles, boolean isBlocked);
}
