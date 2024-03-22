package com.example.ticketmarket_pet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_info")
@Getter
@Setter
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "user_info_id")
    private UUID userInfoId;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "password")
    private String password;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInfo userInfo = (UserInfo) o;
        return Objects.equals(userInfoId, userInfo.userInfoId) && Objects.equals(username, userInfo.username) && Objects.equals(email, userInfo.email) && Objects.equals(phoneNumber, userInfo.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userInfoId, username, email, phoneNumber);
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "username='" + username + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", country=" + country +
                '}';
    }
}
