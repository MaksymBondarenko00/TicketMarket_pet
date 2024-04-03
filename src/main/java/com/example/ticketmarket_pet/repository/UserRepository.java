package com.example.ticketmarket_pet.repository;

import com.example.ticketmarket_pet.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.lang.NonNullApi;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository

public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByUserID(UUID id);

    Optional<User> findByFirstNameAndLastName(String firstName, String lastName);
}