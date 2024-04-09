package com.example.ticketmarket_pet.controller;

import com.example.ticketmarket_pet.entity.PromoCode;
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

import java.util.UUID;

@SpringBootTest
@AutoConfigureMockMvc
@Sql("/drop-test-tables.sql")
@Sql("/create-test-tables.sql")
@Sql("/insert-data-test-changelog.sql")
class PromoCodeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    PromoCode excepted = new PromoCode(UUID.fromString("37643365-3839-3138-6563-663734653861"), 10);

    @Test
    void getPromoById() throws Exception {
        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders.get("/promo/get_promo/37643365-3839-3138-6563-663734653861")
                        .contentType(MediaType.APPLICATION_JSON))
                .andReturn();

        String promoResultJson = mvcResult.getResponse().getContentAsString();
        PromoCode actual = objectMapper.readValue(promoResultJson, PromoCode.class);

        Assertions.assertEquals(200, mvcResult.getResponse().getStatus());
        Assertions.assertEquals(excepted, actual);
    }

}
