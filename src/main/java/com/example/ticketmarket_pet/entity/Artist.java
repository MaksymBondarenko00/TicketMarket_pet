package com.example.ticketmarket_pet.entity;

import com.example.ticketmarket_pet.entity.enums.ArtistRole;
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
@Table(name = "artists")
@Getter
@Setter
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "artist_id")
    private UUID artistID;

    @Column(name = "name")
    private String name;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private ArtistRole role;

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
