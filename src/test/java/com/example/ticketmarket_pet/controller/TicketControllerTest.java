package com.example.ticketmarket_pet.controller;

import com.example.ticketmarket_pet.entity.Event;
import com.example.ticketmarket_pet.entity.Ticket;
import com.example.ticketmarket_pet.entity.User;
import com.example.ticketmarket_pet.entity.enums.AreaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

@SpringBootTest
@AutoConfigureMockMvc
@Sql("/drop-test-tables.sql")
@Sql("/create-test-tables.sql")
@Sql("/insert-data-test-changelog.sql")
public class TicketControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    Ticket expected = new Ticket();
    {
        expected.setTickerID(UUID.fromString("64336538-3337-6234-6530-376334613962"));
        expected.setEventID(new Event());
        expected.setParticipant(new User());
        expected.setAreaType(AreaType.VIP);
        expected.setPrice(BigDecimal.valueOf(50));
        expected.setServicePayments(BigDecimal.valueOf(3));
        expected.setHasBought(true);
        expected.setCreatedAt(new Timestamp(1));
    }

    @Test
    void getTicketById() throws Exception {
        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders.get("/ticket/64336538-3337-6234-6530-376334613962")
                        .contentType(MediaType.APPLICATION_JSON))
                .andReturn();

        String ticketResultJson = mvcResult.getResponse().getContentAsString();
        Ticket actual = objectMapper.readValue(ticketResultJson, Ticket.class);

        Assertions.assertEquals(200, mvcResult.getResponse().getStatus());
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getTicketByType(){
        Ticket expected1 = new Ticket();

        expected1.setTickerID(UUID.fromString("36663066-3764-6430-3035-656434306335"));
        expected1.setEventID(new Event());
        expected1.setParticipant(new User());
        expected1.setAreaType(AreaType.VIP);
        expected1.setPrice(BigDecimal.valueOf(40));
        expected1.setServicePayments(BigDecimal.valueOf(4));
        expected1.setHasBought(true);
        expected1.setCreatedAt(new Timestamp(1));
    }
}
