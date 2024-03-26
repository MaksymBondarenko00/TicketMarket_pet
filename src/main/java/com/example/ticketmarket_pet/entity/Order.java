package com.example.ticketmarket_pet.entity;

import com.example.ticketmarket_pet.entity.enums.PaymentMethod;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "order_id")
    private UUID orderId;

    @Column(name = "client_id")
    private UUID clientID;

    @Column(name = "order_cost")
    private BigDecimal orderCost;

    @OneToOne
    @JoinColumn(name = "promo_code")
    private PromoCode promocode;

    @OneToMany
    @JoinColumn(name = "ticket_id")
    private List<Ticket> selectedTickets;

    @Column(name = "payment_method")
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Column(name = "currency_code")
    private String currencyCode;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(orderId, order.orderId) && Objects.equals(orderCost, order.orderCost) && Objects.equals(createdAt, order.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderCost, createdAt);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderCost=" + orderCost +
                '}';
    }
}
