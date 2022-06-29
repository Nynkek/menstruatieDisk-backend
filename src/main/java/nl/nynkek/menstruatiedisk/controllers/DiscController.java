package nl.nynkek.menstruatiedisk.controllers;

import nl.nynkek.menstruatiedisk.dtos.DiscDto;
import nl.nynkek.menstruatiedisk.dtos.PendingDiscDto;
import nl.nynkek.menstruatiedisk.models.Disc;
import nl.nynkek.menstruatiedisk.services.DiscService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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


    @PostMapping(value = "/addDisc")
    public ResponseEntity<Object> addDisc(@RequestBody DiscDto dto) {
        Long newDisc = discService.createDisc(dto);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(newDisc).toUri();
        return ResponseEntity.created(location).build();
    }

}
