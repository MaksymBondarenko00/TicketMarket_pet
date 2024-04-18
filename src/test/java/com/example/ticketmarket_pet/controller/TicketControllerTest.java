package com.example.ticketmarket_pet.controller;

import com.example.ticketmarket_pet.entity.Event;
import com.example.ticketmarket_pet.entity.Ticket;
import com.example.ticketmarket_pet.entity.User;
import com.example.ticketmarket_pet.entity.enums.AreaType;
import com.example.ticketmarket_pet.entity.enums.EventType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@SpringBootTest
@AutoConfigureMockMvc
@Sql("/drop-test-tables.sql")
@Sql("/create-test-tables.sql")
@Sql("/insert-data-test-changelog.sql")
class TicketControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    Ticket expected = new Ticket();
    {
        expected.setTickerID(UUID.fromString("64336538-3337-6234-6530-376334613962"));
        expected.setEvent(new Event(UUID.fromString("39616566-3762-6663-3062-666234393561"), EventType.valueOf("SPECIAL_EVENT"), "Concert1", "Description for Concert1", new Timestamp(System.currentTimeMillis()), 100, new ArrayList<>()));
        expected.setParticipant(new User());
        expected.setAreaType(AreaType.VIP);
        expected.setPrice(BigDecimal.valueOf(50.0));
        expected.setServicePayments(BigDecimal.valueOf(3));
        expected.setHasBought(true);
        expected.setCreatedAt(new Timestamp(System.currentTimeMillis()));
    }

    @Test
    void getTicketById() throws Exception {
        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders.get("/ticket/showTicket/64336538-3337-6234-6530-376334613962")
                        .contentType(MediaType.APPLICATION_JSON))
                .andReturn();
        String ticketResultJson = mvcResult.getResponse().getContentAsString();
        Ticket actual = objectMapper.readValue(ticketResultJson, Ticket.class);

        Assertions.assertEquals(200, mvcResult.getResponse().getStatus());
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getTicketByType() throws Exception {
        Ticket expected1 = new Ticket();
        expected1.setTickerID(UUID.fromString("36663066-3764-6430-3035-656434306335"));
        expected1.setEvent(new Event(UUID.fromString("37633363-6662-3562-6633-646234656333"), EventType.valueOf("FESTIVAL"),"Concert4","Description for Concert4", new Timestamp(System.currentTimeMillis()), 100, new ArrayList<>()));
        expected1.setParticipant(new User());
        expected1.setAreaType(AreaType.VIP);
        expected1.setPrice(BigDecimal.valueOf(40.0));
        expected1.setServicePayments(BigDecimal.valueOf(4));
        expected1.setHasBought(true);
        expected1.setCreatedAt(new Timestamp(System.currentTimeMillis()));

        List<Ticket> expectedTickets = new ArrayList<>();
        expectedTickets.add(expected);
        expectedTickets.add(expected1);

        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders.get("/ticket/by_type/VIP")
                        .contentType(MediaType.APPLICATION_JSON))
                .andReturn();

        String ticketResultJson = mvcResult.getResponse().getContentAsString();
        List<Ticket> actualTickets = objectMapper.readValue(ticketResultJson, new TypeReference<>() {});

        Assertions.assertEquals(200, mvcResult.getResponse().getStatus());
        Assertions.assertEquals(expectedTickets, actualTickets);
    }
}
