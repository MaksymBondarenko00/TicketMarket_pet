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
@Table(name = "promo_codes")
@Getter
@Setter
public class PromoCode {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "promo_id")
    private UUID promoId;

    @Column(name = "discount_percentage")
    private int discountPercentage;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PromoCode promoCode = (PromoCode) o;
        return discountPercentage == promoCode.discountPercentage && Objects.equals(promoId, promoCode.promoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(promoId, discountPercentage);
    }

    @Override
    public String toString() {
        return "PromoCode{" +
                "promoId=" + promoId +
                ", discountPercentage=" + discountPercentage +
                '}';
    }
}
