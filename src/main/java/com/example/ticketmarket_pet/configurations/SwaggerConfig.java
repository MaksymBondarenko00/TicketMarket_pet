package com.example.ticketmarket_pet.configurations;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "TicketMarket",
                version = "1.0.0",
                contact = @Contact(
                        name = "Maksym Bondarenko",
                        email = "maksym.bondarenko00@gmail.com"
                )
        )
)
public class SwaggerConfig {
}
