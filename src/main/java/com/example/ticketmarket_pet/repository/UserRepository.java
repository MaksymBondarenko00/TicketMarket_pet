package com.example.ticketmarket_pet.repository;

import com.example.ticketmarket_pet.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
//    Optional<User> findById(UUID id);
}
