package nl.nynkek.menstruatiedisk.services;

import nl.nynkek.menstruatiedisk.MenstruatieDiskApplication;
import nl.nynkek.menstruatiedisk.repositories.DiscRepository;
import org.mockito.Mock;
import org.mockito.Mockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ContextConfiguration(classes = {MenstruatieDiskApplication.class})
class DiscServiceTest {

    @Autowired
    private DiscService discService;

    @MockBean
    private DiscRepository discRepository;
//
//    @Mock
//    Disc disc;
//
//
//    @Test
//    void getDiscs() {
//    }
//
//    @Test
//    void createDisc() {
//    }
//
//    @Test
//    void transferToDto() {
//    }
//
//    @Test
//    void toDisc() {
//    }
//
//    @Test
//    void getDisc() {
//    }
//
//    @Test
//    void assignPhotoToDisc() {
//    }
}