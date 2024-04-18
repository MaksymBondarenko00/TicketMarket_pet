package com.example.ticketmarket_pet.exeption;

public class TicketAlreadyPurchasedException extends RuntimeException{
    public TicketAlreadyPurchasedException(String massage){super(massage);}
}
