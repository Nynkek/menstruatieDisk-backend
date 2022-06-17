package nl.nynkek.menstruatiedisk.services;

import nl.nynkek.menstruatiedisk.models.Disc;
import nl.nynkek.menstruatiedisk.repositories.DiscRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscService {

    private final DiscRepository discRepository;

    @Autowired
    public DiscService(DiscRepository discRepository) {
        this.discRepository = discRepository;
    }

    public List<Disc> getDiscs() {
        List<Disc> discs = discRepository.findAll();
        return discs;
    }

    public Disc getDisc(Long id) {
        Disc disc = discRepository.findById(id).get();
        System.out.println("HALLO" + disc);
        return disc;
    }

}

