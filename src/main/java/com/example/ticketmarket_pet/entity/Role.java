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
@Table(name = "roles")
@NoArgsConstructor
public class Role {

    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID roleID;

    @Column(name = "role_name")
    private String roleName;

    @ManyToMany(mappedBy = "roles")
    @JsonBackReference
    private Set<UserInfo> users;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "role_authority",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "authority_id"))
    private Set<Authority> authorities;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(roleID, role.roleID) && Objects.equals(roleName, role.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleID, roleName);
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleID=" + roleID +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}