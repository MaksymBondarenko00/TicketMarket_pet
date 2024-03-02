package com.example.ticketmarket_pet.entity;

import com.example.ticketmarket_pet.entity.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Artist {
    private UUID artistID;
    private String name;
    private Role role;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist artist = (Artist) o;
        return Objects.equals(artistID, artist.artistID) && Objects.equals(name, artist.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artistID, name);
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistID=" + artistID +
                ", name='" + name + '\'' +
                ", role=" + role +
                '}';
    }
}
