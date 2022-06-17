package nl.nynkek.menstruatiedisk.controllers;

import nl.nynkek.menstruatiedisk.models.Disc;
import nl.nynkek.menstruatiedisk.services.DiscService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiscController {
    private final DiscService discService;

    @Autowired
    public DiscController(DiscService discService) {
        this.discService = discService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Disc>> getHomepage() {
        List<Disc> dtos;

        dtos = discService.getDiscs();


        return ResponseEntity.ok().body(dtos);
    }

    @GetMapping("/disc")
    public ResponseEntity<List<Disc>> getDisc() {
        List<Disc> dtos;

        dtos = discService.getDiscs();

        return ResponseEntity.ok().body(dtos);
    }


    @GetMapping("/discs")
    public List<Disc> frontpage() {
        List<Disc> discs = discService.getDiscs();
        return discs;
    }

    @GetMapping("/disc/{id}")
    public ResponseEntity<Disc> getDiscById(@PathVariable("id") Long id) {
        Disc disc = discService.getDisc(id);
        return ResponseEntity.ok().body(disc);
    }

}
