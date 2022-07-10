package nl.nynkek.menstruatiedisk.controllers;

import nl.nynkek.menstruatiedisk.models.User;
import nl.nynkek.menstruatiedisk.services.UserService;
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
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    UserService userService;

    @BeforeEach
    public void setup() {
        User user = new User();
        user.setUsername("tester");
    }

    @Test
    public void getUsersReturnsStatusOk() throws Exception {
        mockMvc.perform(get("/users/"))
                .andExpect(status().isOk());
    }

    @Test
    void retrieveUser() throws Exception {
        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/users/tester"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}