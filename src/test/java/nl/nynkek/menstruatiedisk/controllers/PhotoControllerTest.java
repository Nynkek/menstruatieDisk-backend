package nl.nynkek.menstruatiedisk.controllers;

import static org.junit.jupiter.api.Assertions.*;

import nl.nynkek.menstruatiedisk.models.Disc;
import nl.nynkek.menstruatiedisk.models.FileUploadResponse;
import nl.nynkek.menstruatiedisk.models.User;
import nl.nynkek.menstruatiedisk.services.DiscService;
import nl.nynkek.menstruatiedisk.services.PhotoService;
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
class PhotoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext context;

    @MockBean
    PhotoService photoService;
    FileUploadResponse file;


//    @Test
//    void retrieveFile() throws Exception {
//        this.mockMvc
//                .perform(MockMvcRequestBuilders.get("/download/menstruatiedisklogozwart.png"))
//                .andDo(MockMvcResultHandlers.print())
//                .andExpect(MockMvcResultMatchers.status().isOk());
//    }


}