package nl.nynkek.menstruatiedisk.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User user;

    @BeforeEach
    void setup(){
        user = new User();
    }

    @Test
    void setRoleSetsAuthority(){
        user.setUsername("test");
        user.addAuthority("ROLE_ADMIN");
        Authority expected = new Authority("test", "planner");
        Authority actual = user.getAuthorities().iterator().next();
        assertEquals(expected.getAuthority(), actual.getAuthority());
        assertEquals(expected.getUsername(), actual.getUsername());
    }

}