package com.example.ticketmarket_pet.repository;

import com.example.ticketmarket_pet.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByUserID(UUID id);

    Optional<User> findByFirstNameAndLastName(String firstName, String lastName);

//    @Query(value = "INSERT INTO users (user_id, first_name, last_name, created_at, user_info, role, is_blocked) VALUES (UNHEX(:id), :firstName, :lastName, :createdAt, :userInfoId, :role, :isBlocked);", nativeQuery = true)
//    void createUser(@Param("id") UUID id, @Param("firstName") String firstName, @Param("lastName") String lastName, @Param("createdAt") Timestamp createdAt, @Param("userInfoId") UserInfo userInfoId, Set<Role> role,@Param("isBlocked") boolean isBlocked);

}