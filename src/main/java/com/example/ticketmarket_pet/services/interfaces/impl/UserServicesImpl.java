package com.example.ticketmarket_pet.services.interfaces.impl;

import com.example.ticketmarket_pet.entity.User;
import com.example.ticketmarket_pet.repository.UserRepository;
import com.example.ticketmarket_pet.services.interfaces.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServicesImpl implements UserServices {

    private final UserRepository userRepository;

    @Override
    public User getUserById(String id) {
        return(userRepository.findById(UUID.fromString(id)))
                .orElseThrow(() -> new NoSuchElementException("User not found with id: " + id));
    }
}
