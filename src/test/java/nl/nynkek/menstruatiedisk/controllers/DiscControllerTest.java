package nl.nynkek.menstruatiedisk.controllers;

import nl.nynkek.menstruatiedisk.models.Disc;
import nl.nynkek.menstruatiedisk.models.User;
import nl.nynkek.menstruatiedisk.services.DiscService;
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
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc(addFilters = false)
@SpringBootTest
class DiscControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext context;

    @MockBean
    DiscService discService;
    Disc disc;

    @BeforeEach
    public void setup() {
        disc = new Disc();
        User user = new User();
        user.setUsername("tester");
        disc.setName("testdisc");
        disc.setId(1L);
    }

    @Test
    public void getUserReturnsStatusOk() throws Exception {
        mockMvc.perform(get("/users"))
                .andExpect(status().isOk());
    }

    @Test
    void retrieveDisc() throws Exception {
        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/discs/91"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk());
//                .andExpect(MockMvcResultMatchers.content().string(containsString("1")));
    }

//    @Test
//    public void postCustomerReturnsStatusCreated() throws Exception {
//
//
//        Mockito
//                .when(discService.transferToDto(any(Disc.class)))
//                .thenReturn(disc);
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        System.out.println(objectMapper.writeValueAsString(DiscDto.transferToDto(disc)));
//        mockMvc.perform(post("/discs")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(objectMapper.writeValueAsString(DiscDto.transferToDto(disc))))
//                .andExpect(status().isCreated());
//    }


    @Test
    void getDisc() {
    }

    @Test
    void getDiscById() {
    }

    @Test
    void addDisc() {
    }

    @Test
    void assignPhotoToDisc() {
    }
}