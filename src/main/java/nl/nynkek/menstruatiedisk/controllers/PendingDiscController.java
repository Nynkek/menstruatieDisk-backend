package nl.nynkek.menstruatiedisk.controllers;

import nl.nynkek.menstruatiedisk.models.Brand;
import nl.nynkek.menstruatiedisk.models.PendingDisc;
import nl.nynkek.menstruatiedisk.services.PendingDiscService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PendingDiscController {
    private final PendingDiscService pendingDiscService;

    @Autowired
    public PendingDiscController(PendingDiscService pendingDiscService) {
        this.pendingDiscService = pendingDiscService;
    }

    @GetMapping("/pendingdiscs")
    public List<PendingDisc> getPendingDiscs() {
        return pendingDiscService.getPendingDiscs();
    }

    @GetMapping("pendingdiscs/{id}")
    public PendingDisc getBrandById(@PathVariable("id") Long id) {
        PendingDisc pendingDisc = pendingDiscService.getPendingDisc(id);
        return pendingDisc;
    }
}
