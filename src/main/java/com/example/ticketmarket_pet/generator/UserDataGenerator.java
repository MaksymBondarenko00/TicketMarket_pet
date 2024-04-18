package com.example.ticketmarket_pet.generator;

import com.github.javafaker.Faker;

public class UserDataGenerator {
    private static final Faker FAKER = new Faker();
    public static String genPhoneNumber(){
        return FAKER.phoneNumber().toString();
    }


}
