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

    User exceptedUser = new User();
    {
        exceptedUser.setUserID(UUID.fromString("64303637-3462-3239-3738-613334616333"));
        exceptedUser.setUserInfo(new UserInfo(UUID.fromString("65396466-3431-3231-6536-383334623464"), "john_doe", "john@example.com", "123-456-7890", "1234-5678-9012-3456", "USA", "New York", "password123", new HashSet<>()));
        exceptedUser.setBlocked(false);
        exceptedUser.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        exceptedUser.setFirstName("John");
        exceptedUser.setLastName("Doe");
    }

    UserInfo expectedInfo = new UserInfo();

    {
        expectedInfo.setUserInfoId(UUID.fromString("37633964-6361-3566-6665-613334336433"));
        expectedInfo.setUsername("alice_johnson");
        expectedInfo.setCountry("UK");
        expectedInfo.setCity("London");
        expectedInfo.setEmail("alice@example.com");
        expectedInfo.setPassword("myp@ssw0rd");
        expectedInfo.setPhoneNumber("456-789-0123");
        expectedInfo.setCardNumber("4567-8901-2345-6789");
        expectedInfo.setRoles(new HashSet<>());
    }

    @Test
    void showInfoByUsername() throws Exception {
        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders.get("/user/showUserInfo/alice_johnson")
                        .contentType(MediaType.APPLICATION_JSON))
                .andReturn();

        String userInfoResultJson = mvcResult.getResponse().getContentAsString();
        UserInfo actual = objectMapper.readValue(userInfoResultJson, UserInfo.class);

        Assertions.assertEquals(200, mvcResult.getResponse().getStatus());
        Assertions.assertEquals(expectedInfo, actual);

    }
    @Test
    void showUserById() throws Exception {
        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders.get("/user/showUser/64303637-3462-3239-3738-613334616333")
                        .contentType(MediaType.APPLICATION_JSON))
                .andReturn();

        String userResultJson = mvcResult.getResponse().getContentAsString();
        User actual = objectMapper.readValue(userResultJson, User.class);

        Assertions.assertEquals(200, mvcResult.getResponse().getStatus());
        Assertions.assertEquals(exceptedUser, actual);
    }
    @Test
    void showUserByName() throws Exception{
        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders.get("/user/showUser/John/Doe")
                        .contentType(MediaType.APPLICATION_JSON))
                .andReturn();

        String userResultJson = mvcResult.getResponse().getContentAsString();
        User actual = objectMapper.readValue(userResultJson, User.class);

        Assertions.assertEquals(200, mvcResult.getResponse().getStatus());
        Assertions.assertEquals(exceptedUser, actual);
    }
}
