package com.example.ticketmarket_pet.validation.anotation;


import com.example.ticketmarket_pet.validation.impl.UuidConstraint;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import org.hibernate.validator.internal.constraintvalidators.hv.UUIDValidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Target({FIELD, PARAMETER, TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {UuidConstraint.class})
public @interface Uuid {
    String message() default "It is not UUID format";   // Определяет сообщение
    // по умолчанию, которое будет возвращено, если значение не соответствует UUID-формату.

    Class<?>[] groups() default {};                    // Определяет группы для
    // групповой валидации. По умолчанию не используется никаких групп.

    Class<? extends Payload>[] payload() default {};  // Определяет типы полезной
    // нагрузки, которые могут быть связаны с конкретным ограничением. Обычно
    // используется для передачи метаданных о нарушении.
}
