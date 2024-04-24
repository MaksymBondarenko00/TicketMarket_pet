package com.example.ticketmarket_pet.services.interfaces.impl;

import com.example.ticketmarket_pet.dto.TicketDto;
import com.example.ticketmarket_pet.dto.UserDto;
import com.example.ticketmarket_pet.dto.UserInfoDto;
import com.example.ticketmarket_pet.entity.*;
import com.example.ticketmarket_pet.exeption.ErrorMassage;
import com.example.ticketmarket_pet.exeption.TicketAlreadyPurchasedException;
import com.example.ticketmarket_pet.exeption.UserNotFoundException;
import com.example.ticketmarket_pet.mapper.TicketMapper;
import com.example.ticketmarket_pet.mapper.UserInfoMapper;
import com.example.ticketmarket_pet.mapper.UserMapper;
import com.example.ticketmarket_pet.repository.UserInfoRepository;
import com.example.ticketmarket_pet.repository.UserRepository;
import com.example.ticketmarket_pet.services.interfaces.TicketServices;
import com.example.ticketmarket_pet.services.interfaces.UserServices;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServicesImpl implements UserServices {

    private final UserRepository userRepository;
    private final UserInfoRepository userInfoRepository;
    private final TicketServices ticketServices;

    private final UserMapper userMapper;
    private final UserInfoMapper userInfoMapper;
    private final TicketMapper ticketMapper;

    @Override
    public UserDto getUserById(String id) {
        return userMapper.toDto(userRepository.findById(UUID.fromString(id))
                .orElseThrow(() -> new UserNotFoundException(ErrorMassage.M_USER_NOT_FOUND)));
    }

    @Override
    public UserDto getUserByName(String firstName, String lastName) {
        return userMapper.toDto(userRepository.findByFirstNameAndLastName(firstName, lastName));
    }

    @Override
    @Transactional
    public UserDto buyTicket(UUID ticketId, UUID userId) {
        UserDto userDto = getUserById(String.valueOf(userId));
        Ticket ticket = ticketServices.getTicketById(ticketId);
        Event event = ticket.getEvent();

        if (!ticket.isHasBought()) {
            ticket.setParticipant(userMapper.toEntity(userDto));
            ticket.setHasBought(true);

            event.setCountOfTickets(event.getCountOfTickets() - 1);

            List<Ticket> list = new ArrayList<>();
            list.add(ticket);
            userDto.setUserTickets(list);

            return userDto;
        } else {
            throw new TicketAlreadyPurchasedException(ErrorMassage.M_TICKET_ALREADY_PURCHASED);
        }

    }

    @Override
    public UserInfoDto getInfoByUsername(String username) {
        return userInfoMapper.toDto(userInfoRepository.findByUsername(username));
    }

//    @Override
//    public User createUser(User user) {
//        UserInfo userInfo = user.getUserInfo();
//        userInfoRepository.saveAndFlush(userInfo);
//        return userRepository.saveAndFlush(user);
//    }
}
