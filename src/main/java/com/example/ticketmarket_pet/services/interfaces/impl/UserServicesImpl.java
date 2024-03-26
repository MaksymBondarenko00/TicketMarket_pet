package com.example.ticketmarket_pet.services.interfaces.impl;

import com.example.ticketmarket_pet.entity.*;
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
//    private final UserInfoRepository userInfoRepository;

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
//    public void createUser(UUID id, String firstName, String lastName, Timestamp createdAt, UserInfo userInfo, Set<Role> roles, boolean isBlocked) {
//        User user = new User();
//        user.setUserID(id);
//        user.setFirstName(firstName);
//        user.setLastName(lastName);
////        user.setUserTickets(userTickets);
////        user.setOrders(userOrders);
//        user.setUserInfo(userInfo);
//        user.setRoles(roles);
//        user.setBlocked(isBlocked);
//        user.setCreatedAt(createdAt);
//
//        userRepository.createUser(id, firstName, lastName, createdAt, userInfo, roles, isBlocked);
//    }

//    @Override
//    @Transactional
//    public void createUser(UUID id, String firstName, String lastName, Timestamp createdAt, UserInfo userInfo, Set<Role> roles, boolean isBlocked) {
//        // Сохраняем UserInfo
//        userInfoRepository.save(userInfo);
//
//        // Сохраняем User с ссылкой на сохраненный UserInfo
//        userRepository.createUser(id, firstName, lastName, createdAt, userInfo, roles ,isBlocked);
//    }
}
