package nl.nynkek.menstruatiedisk.models;

import nl.nynkek.menstruatiedisk.MenstruatieDiskApplication;
import nl.nynkek.menstruatiedisk.repositories.PendingDiscRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;
import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ContextConfiguration(classes = {MenstruatieDiskApplication.class})
class PendingDiscTest {
    private PendingDisc pendingDiscTest;

    @Autowired
    private PendingDiscRepository pendingDiscRepository;

    @BeforeEach
    void setup(){
        pendingDiscTest = new PendingDisc();
    }


    @Test
    void test_GettersAndSetters() {

        pendingDiscTest.setName("naam");
        assertEquals("naam", pendingDiscTest.getName());

        pendingDiscTest.setRimWidth(12);
        assertEquals(12, pendingDiscTest.getRimWidth());

        pendingDiscTest.setReusable(true);
        assertEquals(true, pendingDiscTest.isReusable());

        pendingDiscTest.setMaterial(Material.SILICONE);
        assertEquals(Material.SILICONE, pendingDiscTest.getMaterial());
    }

    @Test
    void test_SaveToDatabase() {
        pendingDiscTest.setId(1L);
        pendingDiscTest.setCapacity(30);
        pendingDiscTest.setAvailableInNL(true);
        pendingDiscTest.setDesignFeature("Tof touwtje");
        pendingDiscTest.setName("Ziggy pendingDisc");
        pendingDiscRepository.save(pendingDiscTest);

        Optional<PendingDisc> maybePendingDisc = pendingDiscRepository.findById(1L);

        if (maybePendingDisc.isPresent()) {
        }
        PendingDisc databasePendingDisc = pendingDiscRepository.findById(1L).get();
        assertNotNull(databasePendingDisc);
        assertEquals("Tof touwtje", databasePendingDisc.getDesignFeature());
    }

    @Test
    public void test_ReadAll() {
        List<PendingDisc> pendingDiscList = pendingDiscRepository.findAll();
        assertThat("At least one pendingDisc in database", pendingDiscList.size() > 0);
    }

    @Test
    public void test_Read() {
        PendingDisc pendingDiscFromRepository = pendingDiscRepository.findById(1000L).get();
        assertEquals("Intimina", pendingDiscFromRepository.getBrand());

    }

    @Test
    public void test_Update() {
        PendingDisc pendingDiscFromRepository = pendingDiscRepository.findById(1000L).get();
        pendingDiscFromRepository.setBrand("Merknaam");
        pendingDiscRepository.save(pendingDiscFromRepository);
        assertEquals("Merknaam", pendingDiscRepository.findById(1000L).get().getBrand());

    }

}