package com.example.ticketmarket_pet.controller;



import com.example.ticketmarket_pet.entity.Concert;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.*;

@SpringBootTest
@AutoConfigureMockMvc
@Sql("/drop-test-tables.sql")
@Sql("/create-test-tables.sql")
@Sql("/insert-data-test-changelog.sql")
public class ConcertControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    Concert expected = new Concert();

    {
        expected.setConcertID(UUID.fromString("33316463-3566-6131-6537-633834663061"));
        expected.setConcertName("Concert3");
        expected.setCountry("UK");
        expected.setCity("London");
        expected.setAddress("789 Oxford St");
        expected.setCountOfTickets(1200);
//        Date date = new GregorianCalendar(2025, Calendar.SEPTEMBER, 5).getTime();
        expected.setDate(new GregorianCalendar(2025, Calendar.SEPTEMBER, 5).getTime());
        expected.setListOfArtists(new ArrayList<>());
    }
    @Test
    void findConcertById() throws Exception {
        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders.get("/concert/get_concert/33316463-3566-6131-6537-633834663061")
                        .contentType(MediaType.APPLICATION_JSON))
                .andReturn();

        String concertResultJson = mvcResult.getResponse().getContentAsString();
        Concert actual = objectMapper.readValue(concertResultJson, Concert.class);

        Assertions.assertEquals(200, mvcResult.getResponse().getStatus());
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findConcertByCountry() throws Exception {
        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders.get("/concert/in_country/UK")
                        .contentType(MediaType.APPLICATION_JSON))
                .andReturn();

        List<Concert> exceptedOrders = new ArrayList<>();
        exceptedOrders.add(expected);

        String concertResultJson = mvcResult.getResponse().getContentAsString();
        List<Concert> actual = objectMapper.readValue(concertResultJson, new TypeReference<>() {
        });

        Assertions.assertEquals(200, mvcResult.getResponse().getStatus());
        Assertions.assertEquals(exceptedOrders, actual);
    }

    @Test
    void updateConcert() throws Exception {
        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders.put("/concert/update/33316463-3566-6131-6537-633834663061")
                        .contentType(MediaType.APPLICATION_JSON))
                .andReturn();

        String responseContent = mvcResult.getResponse().getContentAsString();

        assert responseContent.equals("***Updated successfully!***");
    }

}
