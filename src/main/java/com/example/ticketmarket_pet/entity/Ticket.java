package com.example.ticketmarket_pet.entity;

import com.example.ticketmarket_pet.entity.enums.AreaType;
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
@Getter
@Setter
public class Ticket {
    private UUID tickerID;
    private Event eventID;
    private User participant;
    private BigDecimal price;
    private BigDecimal servicePayments;
    private AreaType typeOfArea;
    private boolean hasBought;
    private Timestamp createdAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(tickerID, ticket.tickerID) && Objects.equals(eventID, ticket.eventID) && Objects.equals(price, ticket.price) && typeOfArea == ticket.typeOfArea;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tickerID, eventID, price, typeOfArea);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "tickerID=" + tickerID +
                ", eventID=" + eventID +
                ", price=" + price +
                ", typeOfArea=" + typeOfArea +
                '}';
    }
}
