package com.example.ticketmarket_pet.controller;

import com.example.ticketmarket_pet.entity.Event;
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

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
@Sql("/drop-test-tables.sql")
@Sql("/create-test-tables.sql")
@Sql("/insert-data-test-changelog.sql")
class EventControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

     Event expected = new Event();
    {
        expected.setEventID(UUID.fromString("39616566-3762-6663-3062-666234393561"));
        expected.setName("Concert1");
        expected.setEventType(EventType.SPECIAL_EVENT);
        expected.setDescription("Description for Concert1");
        expected.setCreatedAt(new Timestamp(System.currentTimeMillis()));
    }

    @Test
    void getEventById() throws Exception {
        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders.get("/event/get_event/39616566-3762-6663-3062-666234393561")
                        .contentType(MediaType.APPLICATION_JSON))
                .andReturn();

        String eventResultJson = mvcResult.getResponse().getContentAsString();
        Event actual = objectMapper.readValue(eventResultJson, Event.class);

        Assertions.assertEquals(200, mvcResult.getResponse().getStatus());
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getEventsByType() throws Exception {
        Event expected1 = new Event();
        expected1.setEventID(UUID.fromString("38643336-6134-6430-6539-633234633135"));
        expected1.setName("Concert3");
        expected1.setEventType(EventType.SPECIAL_EVENT);
        expected1.setDescription("Description for Concert3");
        expected1.setCreatedAt(new Timestamp(System.currentTimeMillis()));

        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders.get("/event/by_type/SPECIAL_EVENT")
                        .contentType(MediaType.APPLICATION_JSON))
                .andReturn();

        List<Event> expectedEvents = new ArrayList<>();
        expectedEvents.add(expected);
        expectedEvents.add(expected1);

        String eventResultJson = mvcResult.getResponse().getContentAsString();
        List<Event> actual = objectMapper.readValue(eventResultJson, new TypeReference<>() {});

        Assertions.assertEquals(200, mvcResult.getResponse().getStatus());
        Assertions.assertEquals(expectedEvents, actual);
    }

    @Test
    void createEvent() throws Exception{
        Event event = new Event();
        event.setEventID(UUID.randomUUID());
        event.setName("Test Event");
        event.setEventType(EventType.SPECIAL_EVENT);
        event.setDescription("Test Event Description");
        event.setCreatedAt(new Timestamp(System.currentTimeMillis()));


        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders
                        .post("/event/create")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(event)))
                .andExpect(status().isOk())
                .andReturn();

        String jsonResponse = mvcResult.getResponse().getContentAsString();
        Event createdEvent = objectMapper.readValue(jsonResponse, Event.class);

        assert createdEvent != null;
        assert createdEvent.getEventID() != null;
    }
}
