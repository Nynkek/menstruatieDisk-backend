package nl.nynkek.menstruatiedisk.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscTest {

    @Test
    void test_ConstructorDisc() {

        Disc disc = new Disc();

        disc.setBrand("Ziggy");

        assertEquals("Ziggy", disc.getBrand());
    }

}