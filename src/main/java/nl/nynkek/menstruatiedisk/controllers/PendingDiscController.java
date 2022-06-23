package nl.nynkek.menstruatiedisk.controllers;

import nl.nynkek.menstruatiedisk.dtos.PendingDiscDto;
import nl.nynkek.menstruatiedisk.dtos.UserDto;
import nl.nynkek.menstruatiedisk.models.Brand;
import nl.nynkek.menstruatiedisk.models.PendingDisc;
import nl.nynkek.menstruatiedisk.services.PendingDiscService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    @PostMapping(value = "/addDisc")
    public ResponseEntity<Object> addDisc(@RequestBody PendingDiscDto dto) {

        Long newPendingDisc = pendingDiscService.createPendingDisc(dto);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(newPendingDisc).toUri();

        return ResponseEntity.created(location).build();
    }

}
