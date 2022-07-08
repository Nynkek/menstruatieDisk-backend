package nl.nynkek.menstruatiedisk.controllers;

import nl.nynkek.menstruatiedisk.dtos.DiscDto;
import nl.nynkek.menstruatiedisk.dtos.PendingDiscDto;
import nl.nynkek.menstruatiedisk.models.Disc;
import nl.nynkek.menstruatiedisk.models.FileUploadResponse;
import nl.nynkek.menstruatiedisk.services.DiscService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/discs")
public class DiscController {
    private final DiscService discService;
    private final PhotoController controller;

    @Autowired
    public DiscController(DiscService discService, PhotoController controller) {
        this.discService = discService;
        this.controller = controller;
    }


    @GetMapping("/")
    public ResponseEntity<List<Disc>> getDisc() {
        List<Disc> dtos;

        dtos = discService.getDiscs();

        return ResponseEntity.ok().body(dtos);
    }


//    @GetMapping("/")
//    public List<Disc> frontpage() {
//        List<Disc> discs = discService.getDiscs();
//        return discs;
//    }

    @GetMapping("/{id}")
    public ResponseEntity<DiscDto> getDiscById(@PathVariable("id") Long id) {
        try {
            DiscDto disc = discService.getDisc(id);
            return ResponseEntity.ok().body(disc);
        } catch (Exception exception) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(value = "/addDisc")
    public Disc addDisc(@RequestBody DiscDto dto) {
        Disc newDisc = discService.createDisc(dto);

//        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
//                .buildAndExpand(newDisc).toUri();
        return newDisc;
    }

    @PostMapping("/{id}/photo")
    public void assignPhotoToDisc(@PathVariable("id") Long id,
                                  @RequestParam("image") MultipartFile file) {

        FileUploadResponse image = controller.singleFileUpload(file);

        discService.assignPhotoToDisc(image.getFileName(), id);

    }

}
