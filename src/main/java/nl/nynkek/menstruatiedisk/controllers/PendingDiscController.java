package nl.nynkek.menstruatiedisk.controllers;

import nl.nynkek.menstruatiedisk.models.Brand;
import nl.nynkek.menstruatiedisk.models.PendingDisc;
import nl.nynkek.menstruatiedisk.services.PendingDiscService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/pendingdiscs")
public class PendingDiscController {
    private final PendingDiscService pendingDiscService;

    @Autowired
    public PendingDiscController(PendingDiscService pendingDiscService) {
        this.pendingDiscService = pendingDiscService;
    }

    @GetMapping("/")
    public List<PendingDisc> getPendingDiscs() {
        return pendingDiscService.getPendingDiscs();
    }

    @GetMapping("/{id}")
    public PendingDisc getBrandById(@PathVariable("id") Long id) {
        PendingDisc pendingDisc = pendingDiscService.getPendingDisc(id);
        return pendingDisc;
    }
}
