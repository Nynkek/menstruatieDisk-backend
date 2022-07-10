package nl.nynkek.menstruatiedisk.controllers;

import nl.nynkek.menstruatiedisk.MenstruatieDiskApplication;
import nl.nynkek.menstruatiedisk.models.Disc;
import nl.nynkek.menstruatiedisk.models.User;
import nl.nynkek.menstruatiedisk.services.DiscService;
import nl.nynkek.menstruatiedisk.utils.JwtUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ContextConfiguration;
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

//@ContextConfiguration(classes = {MenstruatieDiskApplication.class})
//@SpringBootTest
//class AuthenticationControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
////    @Autowired
////    private WebApplicationContext context;
//
//    @MockBean
//    UserDetailsService userDetailsService;
////    AuthenticationManager authenticationManager;
////    JwtUtil jwtUtil;
//
//    @Test
//    @WithMockUser(roles = "ADMIN")
//    public void getAuthReturnsStatusOk() throws Exception {
//        mockMvc.perform(get("/authenticated"))
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    @WithMockUser(roles = "ADMIN")
//    public void mytest1() throws Exception {
//        mockMvc.perform(get("/users"))
//                .andExpect(status().isOk());
//    }

}