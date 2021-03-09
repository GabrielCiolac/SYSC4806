package com.bmgs.main;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.containsString;

@SpringBootTest
@AutoConfigureMockMvc
public class AddOpenQuestionsAPITests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testPostOpenEndedQuestion() throws Exception {
        // create form to test with
        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/forms")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{ \"title\": \"MyForm\"}")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andDo(print());

        // send post with question
        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/form/openended/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{ \"question\": \"MyQuestion?\"}")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andDo(print());

        // get to test if question exists
        this.mockMvc.perform(
                get("/form/1"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("MyQuestion?")));
    }
}
