package com.heritage.instantcard.controller;

import com.heritage.instantcard.service.InstantCardService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
class InstantCardControllerTest {

    @Mock
    InstantCardService cardService;

    @InjectMocks
    InstantCardController controller;

    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    void getJSONInstantCard() throws Exception{

        mockMvc.perform(get("/instantCard/JSON/R000044").contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk());
    }

    @Test
    void getXMLInstantCard() throws Exception {
        mockMvc.perform(get("/instantCard/XML/R000044").contentType(MediaType.APPLICATION_XML_VALUE))
                .andExpect(status().isOk());
    }
}