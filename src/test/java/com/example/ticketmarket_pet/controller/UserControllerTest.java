package com.example.ticketmarket_pet.controller;

import com.example.ticketmarket_pet.entity.User;
import com.example.ticketmarket_pet.entity.UserInfo;
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
import java.util.HashSet;
import java.util.UUID;



@SpringBootTest
@AutoConfigureMockMvc
@Sql("/drop-test-tables.sql")
@Sql("/create-test-tables.sql")
@Sql("/insert-data-test-changelog.sql")
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    User excepted = new User();
    {
        excepted.setUserID(UUID.fromString("64303637-3462-3239-3738-613334616333"));
        excepted.setUserInfo(new UserInfo(UUID.fromString("65396466-3431-3231-6536-383334623464"), "john_doe", "john@example.com", "123-456-7890", "1234-5678-9012-3456", "USA", "New York", "password123", new HashSet<>()));
        excepted.setBlocked(false);
        excepted.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        excepted.setFirstName("John");
        excepted.setLastName("Doe");
    }
    @Test
    void showUserById() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/user/showUser/64303637-3462-3239-3738-613334616333")
                        .contentType(MediaType.APPLICATION_JSON))
                .andReturn();

        String userResultJson = mvcResult.getResponse().getContentAsString();
        User actual = objectMapper.readValue(userResultJson, User.class);

        Assertions.assertEquals(200, mvcResult.getResponse().getStatus());
        Assertions.assertEquals(excepted, actual);
    }
    @Test
    void showUserByName() throws Exception{
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/user/showUser/John/Doe")
                        .contentType(MediaType.APPLICATION_JSON))
                .andReturn();

        String userResultJson = mvcResult.getResponse().getContentAsString();
        User actual = objectMapper.readValue(userResultJson, User.class);

        Assertions.assertEquals(200, mvcResult.getResponse().getStatus());
        Assertions.assertEquals(excepted, actual);
    }
}
