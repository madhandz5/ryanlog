package me.ryan.ryanlog.api.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest
class PostControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    void get() throws Exception {
        mockMvc.perform(
                        MockMvcRequestBuilders.get("/api/posts")
                                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().string(HttpStatus.OK.name()))
                .andDo(print());
    }
}