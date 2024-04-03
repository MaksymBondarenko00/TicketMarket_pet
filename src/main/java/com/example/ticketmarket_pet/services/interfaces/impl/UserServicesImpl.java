package com.example.ticketmarket_pet.services.interfaces.impl;

import com.example.ticketmarket_pet.entity.*;
import com.example.ticketmarket_pet.repository.UserInfoRepository;
import com.example.ticketmarket_pet.repository.UserRepository;
import com.example.ticketmarket_pet.services.interfaces.UserInfoServices;
import com.example.ticketmarket_pet.services.interfaces.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServicesImpl implements UserServices {

    private final UserRepository userRepository;
    private final UserInfoRepository userInfoRepository;

    @Override
    public User getUserById(String id) {
        return (userRepository.findByUserID(UUID.fromString(id))
                .orElseThrow(() -> new NoSuchElementException("User not found with id: " + id)));
    }

    @Override
    public User getUserByName(String firstName, String lastName) {
        return (userRepository.findByFirstNameAndLastName(firstName, lastName)
                .orElseThrow(() -> new NoSuchElementException("User not found with name: " + firstName + " " + lastName)));
    }

//    @Override
//    public User createUser(User user) {
//        UserInfo userInfo = user.getUserInfo();
//        userInfoRepository.saveAndFlush(userInfo);
//        return userRepository.saveAndFlush(user);
//    }
}
