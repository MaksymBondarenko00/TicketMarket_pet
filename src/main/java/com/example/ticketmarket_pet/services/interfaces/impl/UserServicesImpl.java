package com.example.ticketmarket_pet.services.interfaces.impl;

import com.example.ticketmarket_pet.dto.UserDto;
import com.example.ticketmarket_pet.dto.UserInfoDto;
import com.example.ticketmarket_pet.entity.*;
import com.example.ticketmarket_pet.repository.UserInfoRepository;
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
    private final UserInfoRepository userInfoRepository;

    @Override
    public UserDto getUserById(UUID id) {
        return (userRepository.findByUserID(id));
    }

    @Override
    public UserDto getUserByName(String firstName, String lastName) {
        return (userRepository.findByFirstNameAndLastName(firstName, lastName));
    }

    @Override
    public UserInfoDto getInfoByUsername(String username) {
        return userInfoRepository.findByUsername(username);
    }

//    @Override
//    public User createUser(User user) {
//        UserInfo userInfo = user.getUserInfo();
//        userInfoRepository.saveAndFlush(userInfo);
//        return userRepository.saveAndFlush(user);
//    }
}
