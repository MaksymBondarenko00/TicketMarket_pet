package com.example.ticketmarket_pet.entity;

import com.example.ticketmarket_pet.entity.enums.AreaType;
import com.fasterxml.jackson.annotation.JsonFormat;
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

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "service_payments")
    private BigDecimal servicePayments;

    @Column(name = "has_bought")
    private boolean hasBought;

    @Column(name = "area_type")
    @Enumerated(EnumType.STRING)
    private AreaType areaType;

    @OneToOne
    @JoinColumn(name = "event_id")
    private Event event;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User participant;

    @Column(name = "created_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Timestamp createdAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(tickerID, ticket.tickerID) && Objects.equals(event, ticket.event) && Objects.equals(price, ticket.price) && areaType == ticket.areaType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tickerID, event, price, areaType);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "tickerID=" + tickerID +
                ", eventID=" + event +
                ", price=" + price +
                ", typeOfArea=" + areaType +
                '}';
    }
}
