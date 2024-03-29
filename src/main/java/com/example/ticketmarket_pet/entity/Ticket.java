package com.example.ticketmarket_pet.entity;

import com.example.ticketmarket_pet.entity.enums.AreaType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tickets")
@Getter
@Setter
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ticket_id")
    private UUID tickerID;

    @OneToOne
    @JoinColumn(name = "event_id")
    private Event eventID;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User participant;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "service_payments")
    private BigDecimal servicePayments;

    @Column(name = "area_type")
    @Enumerated(EnumType.ORDINAL)
    private AreaType areaType;

    @Column(name = "has_bought")
    private boolean hasBought;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(tickerID, ticket.tickerID) && Objects.equals(eventID, ticket.eventID) && Objects.equals(price, ticket.price) && areaType == ticket.areaType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tickerID, eventID, price, areaType);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "tickerID=" + tickerID +
                ", eventID=" + eventID +
                ", price=" + price +
                ", typeOfArea=" + areaType +
                '}';
    }
}
