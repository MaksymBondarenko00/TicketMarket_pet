package com.example.ticketmarket_pet.controller;

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

import java.util.HashSet;
import java.util.UUID;

@SpringBootTest
@AutoConfigureMockMvc
@Sql("/drop-test-tables.sql")
@Sql("/create-test-tables.sql")
@Sql("/insert-data-test-changelog.sql")
public class UserInfoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    UserInfo expected = new UserInfo();

    {
        expected.setUserInfoId(UUID.fromString("37633964-6361-3566-6665-613334336433"));
        expected.setUsername("alice_johnson");
        expected.setCountry("UK");
        expected.setCity("London");
        expected.setEmail("alice@example.com");
        expected.setPassword("myp@ssw0rd");
        expected.setPhoneNumber("456-789-0123");
        expected.setCardNumber("4567-8901-2345-6789");
        expected.setRoles(new HashSet<>());
    }

    @Test
    void showInfoByUsername() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/user_info/showUser/alice_johnson")
                        .contentType(MediaType.APPLICATION_JSON))
                .andReturn();
        String userInfoResultJson = mvcResult.getResponse().getContentAsString();
        UserInfo actual = objectMapper.readValue(userInfoResultJson, UserInfo.class);

        Assertions.assertEquals(200, mvcResult.getResponse().getStatus());
        Assertions.assertEquals(expected, actual);
    }

}
