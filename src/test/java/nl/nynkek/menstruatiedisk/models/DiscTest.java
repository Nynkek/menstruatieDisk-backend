package nl.nynkek.menstruatiedisk.models;

import nl.nynkek.menstruatiedisk.MenstruatieDiskApplication;
import nl.nynkek.menstruatiedisk.repositories.DiscRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.GreaterThan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
@ContextConfiguration(classes = {MenstruatieDiskApplication.class})
class DiscTest {
    private Disc disc;

    @Autowired
    DiscRepository discRepository;

    @BeforeEach
    void setup(){
        disc = new Disc();
    }


    @Test
    void test_GettersAndSetters() {

        disc.setName("naam");
        assertEquals("naam", disc.getName());

        disc.setRimWidth(12);
        assertEquals(12, disc.getRimWidth());

        disc.setReusable(true);
        assertEquals(true, disc.isReusable());

        disc.setMaterial(Material.SILICONE);
        assertEquals(Material.SILICONE, disc.getMaterial());
    }

    @Test
    void test_SaveToDatabase() {
        disc.setId(1L);
        disc.setCapacity(30);
        disc.setAvailableInNL(true);
        disc.setDesignFeature("Tof touwtje");
        disc.setName("Ziggy disc");
        discRepository.save(disc);

        java.util.Optional<Disc> maybeDisc = discRepository.findById(1L);

        if (maybeDisc.isPresent()) {
        }
        Disc databaseDisc = discRepository.findById(1L).get();
        assertNotNull(databaseDisc);
        assertEquals("Tof touwtje", databaseDisc.getDesignFeature());
    }

    @Test
    public void test_ReadAll() {
        List<Disc> discList = discRepository.findAll();
        assertThat("At least one disc in database", discList.size() > 0);
    }

    @Test
    public void test_Read() {
        Disc discFromRepo = discRepository.findById(91L).get();
        assertEquals("Flex", discFromRepo.getBrand());

    }

    @Test
    public void test_Update() {
        Disc discFromRepo = discRepository.findById(92L).get();
        discFromRepo.setBrand("Merknaam");
        discRepository.save(discFromRepo);
        assertEquals("Merknaam", discRepository.findById(92L).get().getBrand());

    }

}