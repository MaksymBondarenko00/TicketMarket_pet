package com.example.ticketmarket_pet.controller;


import com.example.ticketmarket_pet.entity.Artist;
import com.example.ticketmarket_pet.entity.Order;
import com.example.ticketmarket_pet.entity.enums.ArtistRole;
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

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@Sql("/drop-test-tables.sql")
@Sql("/create-test-tables.sql")
@Sql("/insert-data-test-changelog.sql")
class ArtistControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    Artist expected = new Artist();

    {
        expected.setArtistID(UUID.fromString("65356136-6438-6339-6230-613366316532"));
        expected.setName("Artist1");
        expected.setRole(ArtistRole.BAND);
    }

    @Test
    void showArtistById() throws Exception {
        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders.get("/artist/getArtist/65356136-6438-6339-6230-613366316532")
                        .contentType(MediaType.APPLICATION_JSON))
                .andReturn();

        String artistResultJson = mvcResult.getResponse().getContentAsString();
        Artist actual = objectMapper.readValue(artistResultJson, Artist.class);

        Assertions.assertEquals(200, mvcResult.getResponse().getStatus());
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void deleteArtist() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders
                        .delete("/artist/delete/" + expected.getArtistID())
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String responseContent = mvcResult.getResponse().getContentAsString();

        assert responseContent.equals("***Deleted successfully!***");
    }
}
