package nl.nynkek.menstruatiedisk.models;

import nl.nynkek.menstruatiedisk.MenstruatieDiskApplication;
import nl.nynkek.menstruatiedisk.repositories.DiscRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
@ContextConfiguration(classes = {MenstruatieDiskApplication.class})
class DiscTest {

    @Autowired
    DiscRepository discRepo;

    Disc disc = new Disc();

    @Test
    void test_ConstructorDisc() {
        disc.setBrand("Ziggy");

        assertEquals("Ziggy", disc.getBrand());
    }

    @Test
    void test_SaveToDatabase() {
        disc.setId(1L);
        disc.setCapacity(30);
        disc.setAvailableInNL(true);
        disc.setDesignFeature("Tof touwtje");
        disc.setName("Ziggy disc");
        discRepo.save(disc);
        assertNotNull(discRepo.findById(1L).get());
    }

//    @Test
//    public void test_ReadAll() {
//        List<Disc> discList = discRepo.findAll();
//        assertThat(discList).size().isGreaterThan(0);
//    }

//    @Test
//    public void test_Read() {
//        disc.setName("Ziggy disc");
//
//        Disc disc = discRepo.findById(1L).get();
//        assertEquals("Ziggy disc", disc.getName());
//    }
//
//    @Test
//    public void test_Update() {
//        Disc disc1 = discRepo.findById(1L).get();
//        disc1.setBrand("Merknaam");
//        discRepo.save(disc1);
//        assertNotEquals("Ziggy", discRepo.findById(1L).get());
//    }

}