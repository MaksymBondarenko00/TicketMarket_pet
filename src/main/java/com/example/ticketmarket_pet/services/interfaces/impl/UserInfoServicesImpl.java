package com.example.ticketmarket_pet.services.interfaces.impl;

import com.example.ticketmarket_pet.entity.User;
import com.example.ticketmarket_pet.entity.UserInfo;
import com.example.ticketmarket_pet.repository.UserInfoRepository;
import com.example.ticketmarket_pet.services.interfaces.UserInfoServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserInfoServicesImpl implements UserInfoServices {

    private final UserInfoRepository userInfoRepository;
    @Override
    public UserInfo getInfoByUsername(String username) {
        return userInfoRepository.findByUsername(username);
    }




}
