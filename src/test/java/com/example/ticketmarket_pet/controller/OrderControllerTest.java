package com.example.ticketmarket_pet.controller;

import com.example.ticketmarket_pet.entity.Order;
import com.example.ticketmarket_pet.entity.PromoCode;
import com.example.ticketmarket_pet.entity.enums.PaymentMethod;
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
class OrderControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    Order expected = new Order();

    {
        expected.setOrderId(UUID.fromString("65346234-6637-6161-6566-613734306330"));
        expected.setClientID(UUID.fromString("61386536-6333-6639-6264-356434393964"));
        expected.setOrderCost(BigDecimal.valueOf(50));
        expected.setPromocode(new PromoCode(UUID.fromString("39626636-6432-3662-3539-333734383538"), 20));
        expected.setPaymentMethod(PaymentMethod.PAYPAL);
        expected.setCurrencyCode("USD");
        expected.setCreatedAt(new Timestamp(System.currentTimeMillis()));
    }

    @Test
    void getOrderById() throws Exception {
        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders.get("/order/get_order/65346234-6637-6161-6566-613734306330")
                        .contentType(MediaType.APPLICATION_JSON))
                .andReturn();

        String orderResultJson = mvcResult.getResponse().getContentAsString();
        Order actual = objectMapper.readValue(orderResultJson, Order.class);

        Assertions.assertEquals(200, mvcResult.getResponse().getStatus());
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ordersByCurrencyCodeAndPaymentMethod() throws Exception {
        Order expected1 = new Order();
        expected1.setOrderId(UUID.fromString("38613063-6262-3163-3162-366634376136"));
        expected1.setClientID(UUID.fromString("66316236-6664-3666-3637-653434633833"));
        expected1.setOrderCost(BigDecimal.valueOf(120));
        expected1.setPromocode(null);
        expected1.setPaymentMethod(PaymentMethod.PAYPAL);
        expected1.setCurrencyCode("USD");
        expected1.setCreatedAt(new Timestamp(System.currentTimeMillis()));

        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders.get("/order/by_currency/USD/and_payment_method/PAYPAL")
                        .contentType(MediaType.APPLICATION_JSON))
                .andReturn();

        List<Order> exceptedOrders = new ArrayList<>();
        exceptedOrders.add(expected);
        exceptedOrders.add(expected1);

        String orderResultJson = mvcResult.getResponse().getContentAsString();
        List<Order> actual = objectMapper.readValue(orderResultJson, new TypeReference<>() {
        });

        Assertions.assertEquals(200, mvcResult.getResponse().getStatus());
        Assertions.assertEquals(exceptedOrders, actual);
    }
}
