package com.example.ticketmarket_pet.exeption;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String massage){super(massage);}
}
