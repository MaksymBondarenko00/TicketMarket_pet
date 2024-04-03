package com.example.ticketmarket_pet.validation.impl;


import com.example.ticketmarket_pet.validation.anotation.Uuid;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


import java.util.Optional;


public class UuidConstraint implements ConstraintValidator<Uuid, String> {
    private static final String UUID = "^[a-zA-Z]{3}$";

    @Override
    public void initialize(Uuid constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String uuid, ConstraintValidatorContext constraintValidatorContext) {
        return Optional.ofNullable(uuid)
                .filter(s -> !s.isBlank())
                .map(s -> s.matches(UUID))
                .orElse(false);
    }
}
