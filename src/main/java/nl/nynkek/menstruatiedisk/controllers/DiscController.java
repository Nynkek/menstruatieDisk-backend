package nl.nynkek.menstruatiedisk.controllers;

import nl.nynkek.menstruatiedisk.models.Disc;
import nl.nynkek.menstruatiedisk.services.DiscService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/discs")
public class DiscController {
    private final DiscService discService;

    @Autowired
    public DiscController(DiscService discService) {
        this.discService = discService;
    }

//
//    @GetMapping("/")
//    public ResponseEntity<List<Disc>> getDisc() {
//        List<Disc> dtos;
//
//        dtos = discService.getDiscs();
//
//        return ResponseEntity.ok().body(dtos);
//    }


    @GetMapping("/")
    public List<Disc> frontpage() {
        List<Disc> discs = discService.getDiscs();
        return discs;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Disc> getDiscById(@PathVariable("id") Long id) {
        Disc disc = discService.getDisc(id);
        return ResponseEntity.ok().body(disc);
    }

}
