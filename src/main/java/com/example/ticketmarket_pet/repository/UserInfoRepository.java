package com.example.ticketmarket_pet.repository;

import com.example.ticketmarket_pet.dto.UserInfoDto;
import com.example.ticketmarket_pet.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, UUID> {
    UserInfo findByUsername(String username);
}
