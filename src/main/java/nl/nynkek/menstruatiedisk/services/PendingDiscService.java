package nl.nynkek.menstruatiedisk.services;

import nl.nynkek.menstruatiedisk.models.PendingDisc;
import nl.nynkek.menstruatiedisk.repositories.PendingDiscRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PendingDiscService {
    private final PendingDiscRepository pendingDiscRepository;

    @Autowired
    public PendingDiscService(PendingDiscRepository pendingDiscRepository) {
        this.pendingDiscRepository = pendingDiscRepository;
    }

    public List<PendingDisc> getPendingDiscs() {
        List<PendingDisc> pendingDiscs = pendingDiscRepository.findAll();
        return pendingDiscs;
    }

    public PendingDisc getPendingDisc(Long id) {
        PendingDisc pendingDisc = pendingDiscRepository.findById(id).get();
        return pendingDisc;
    }
}
