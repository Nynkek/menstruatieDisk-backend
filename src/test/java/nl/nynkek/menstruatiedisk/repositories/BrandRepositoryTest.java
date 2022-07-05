package nl.nynkek.menstruatiedisk.repositories;


import nl.nynkek.menstruatiedisk.MenstruatieDiskApplication;

import nl.nynkek.menstruatiedisk.models.Disc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.mockito.Mockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ContextConfiguration;

@DataJpaTest
@ContextConfiguration(classes = {MenstruatieDiskApplication.class})
class BrandRepositoryTest {

//    @Autowired
//    private TestEntityManager entityManager;

//    @Autowired
//    private BrandRepository brandRepository;

//    @Test
//    void testGetBrands() {
//        Disc disc = new Disc();
//        disc.setBrand("Ziggy");
//        entityManager.persist(disc);
////        entityManager.flush();
//
//        Brand found = brandRepository.findAll();
//
//        String expected = "";
//        String actual = found.getBrand();
//        assertEquals(expected, actual);

//    }

}