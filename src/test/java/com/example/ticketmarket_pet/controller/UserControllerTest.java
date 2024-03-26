package com.example.ticketmarket_pet.controller;

import com.example.ticketmarket_pet.entity.User;
import com.example.ticketmarket_pet.entity.UserInfo;
import com.fasterxml.jackson.databind.ObjectMapper;

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

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
@Sql("/create-test-tables.sql")
@Sql("/insert-data-test-changelog.sql")
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void showUserById() throws Exception {
//        User excepted = new User();
//        excepted.setUserID(UUID.fromString("d0674b2978a34ac3bd6f96f5d9854a82"));
//        excepted.setUserInfo(new UserInfo(UUID.fromString("e9df4121e6834b4d9537b8a7d822e7a2"),
//                "john_doe",
//                "john@example.com",
//                "123-456-7890",
//                "1234-5678-9012-3456",
//                "USA",
//                "New York",
//                "password123"
//        ));
//        excepted.setBlocked(false);
//        excepted.setRoles(new HashSet<>());
//        excepted.setCreatedAt(new Timestamp(1));
//        excepted.setFirstName("John");
//        excepted.setLastName("Doe");
//
//        MvcResult showResult = mockMvc.perform(MockMvcRequestBuilders.get("/user/showUser/d0674b2978a34ac3bd6f96f5d9854a82")
//                .contentType(MediaType.APPLICATION_JSON))
//                .andReturn();
//        )

    }
}
