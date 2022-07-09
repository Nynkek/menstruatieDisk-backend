package nl.nynkek.menstruatiedisk.controllers;

import nl.nynkek.menstruatiedisk.dtos.PendingDiscDto;
import nl.nynkek.menstruatiedisk.models.FileUploadResponse;
import nl.nynkek.menstruatiedisk.models.PendingDisc;
import nl.nynkek.menstruatiedisk.services.PendingDiscService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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
    public PendingDisc addPendingDisc(@RequestBody PendingDiscDto dto) {

        PendingDisc newPendingDisc = pendingDiscService.createPendingDisc(dto);

//        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
//                .buildAndExpand(newPendingDisc).toUri();

        return newPendingDisc;
    }

    @PostMapping("/{id}/photo")
    public void assignPhotoToPendingDisc(@PathVariable("id") Long id,
                                     @RequestParam("image") MultipartFile file) {

        FileUploadResponse image = controller.singleFileUpload(file);

        pendingDiscService.assignPhotoToPendingDisc(image.getFileName(), id);

    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Object> deletePendingDisc(@PathVariable("id") Long id) {
        pendingDiscService.deletePendingDisc(id);
        return ResponseEntity.noContent().build();
    }

}
