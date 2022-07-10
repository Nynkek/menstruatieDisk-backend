package nl.nynkek.menstruatiedisk.controllers;

import static org.junit.jupiter.api.Assertions.*;

import nl.nynkek.menstruatiedisk.models.Disc;
import nl.nynkek.menstruatiedisk.models.PendingDisc;
import nl.nynkek.menstruatiedisk.models.User;
import nl.nynkek.menstruatiedisk.services.DiscService;
import nl.nynkek.menstruatiedisk.services.PendingDiscService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc(addFilters = false)
@SpringBootTest
class PendingDiscControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @MockBean
    PendingDiscService pendingDiscService;
    PendingDisc pendingDisc;

    @BeforeEach
    public void setup() {
        pendingDisc = new PendingDisc();
        User user = new User();
        user.setUsername("tester");
        pendingDisc.setName("testpendingDisc");
        pendingDisc.setId(1L);
    }

    @Test
    public void getPendingDiscsReturnsStatusOk() throws Exception {
        mockMvc.perform(get("/pendingdiscs/"))
                .andExpect(status().isOk());
    }

    @Test
    void retrievePendingDisc() throws Exception {
        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/pendingdiscs/1000"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}