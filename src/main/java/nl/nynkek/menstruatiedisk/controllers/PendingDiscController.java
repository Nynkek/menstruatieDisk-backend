package nl.nynkek.menstruatiedisk.controllers;

import nl.nynkek.menstruatiedisk.dtos.PendingDiscDto;
import nl.nynkek.menstruatiedisk.dtos.UserDto;
import nl.nynkek.menstruatiedisk.models.Brand;
import nl.nynkek.menstruatiedisk.models.FileUploadResponse;
import nl.nynkek.menstruatiedisk.models.PendingDisc;
import nl.nynkek.menstruatiedisk.services.PendingDiscService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/pendingdiscs")
public class PendingDiscController {
    private final PendingDiscService pendingDiscService;
    private final PhotoController controller;


    @Autowired
    public PendingDiscController(PendingDiscService pendingDiscService, PhotoController controller) {
        this.pendingDiscService = pendingDiscService;
        this.controller = controller;
    }

    @GetMapping("/")
    public List<PendingDisc> getPendingDiscs() {
        return pendingDiscService.getPendingDiscs();
    }

    @GetMapping("/{id}")
    public PendingDisc getPendingDiscsById(@PathVariable("id") Long id) {
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

    @PostMapping("/{id}/photo")
    public void assignPhotoToPendingDisc(@PathVariable("id") Long id,
                                     @RequestBody MultipartFile file) {

        FileUploadResponse image = controller.singleFileUpload(file);

        pendingDiscService.assignPhotoToPendingDisc(image.getFileName(), id);

    }

}
