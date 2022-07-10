package nl.nynkek.menstruatiedisk.models;

import nl.nynkek.menstruatiedisk.dtos.UserDto;
import nl.nynkek.menstruatiedisk.services.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserTest {
    private User user;

    @Autowired
    UserService userService;

    @BeforeEach
    void setup(){
        user = new User();
    }


    @Test
    void setRoleSetsAuthority(){
        user.setUsername("test");
        Authority authority = new Authority("test", "ROLE_ADMIN");
        user.addAuthority(authority);

        Authority expected = new Authority("test", "ROLE_ADMIN");

        Authority actual = user.getAuthorities().iterator().next();
        assertEquals(expected.getAuthority(), actual.getAuthority());
        assertEquals(expected.getUsername(), actual.getUsername());
    }
    @Test
    void registerUser() {

        UserDto userDto = new UserDto();
        userDto.setUsername("Testert");
        userDto.setEmailAdress("test@testen.nl");
        userDto.setPassword("wachtw00rd");

        String username = userService.createUser(userDto);

        assertEquals("Testert", username);
    }

}