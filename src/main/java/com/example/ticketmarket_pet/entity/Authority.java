package com.example.ticketmarket_pet.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "authorities")
@NoArgsConstructor
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "authority_id")
    private UUID authorityID;

    @Column(name = "authority_name")
    private String authority;

    @ManyToMany(mappedBy = "authorities")
    @JsonBackReference
    private Set<Role> roles;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Authority authority = (Authority) o;
        return Objects.equals(authorityID, authority.authorityID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorityID);
    }

    @Override
    public String toString() {
        return "Authority{" +
                "authorityID=" + authorityID +
                ", authority='" + authority +
                '}';
    }
}