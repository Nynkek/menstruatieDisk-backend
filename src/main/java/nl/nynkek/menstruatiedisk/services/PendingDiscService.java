package nl.nynkek.menstruatiedisk.services;

import nl.nynkek.menstruatiedisk.dtos.PendingDiscDto;
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

    public Long createPendingDisc(PendingDiscDto pendingDiscDto) {
        PendingDisc newPendingDisc = pendingDiscRepository.save(toPendingDisc(pendingDiscDto));
        return newPendingDisc.getId();
    }

    public void deletePendingDisc(Long id) {
        pendingDiscRepository.deleteById(id);
    }

//    public void updatePendingDisc(Long id, PendingDiscDto newPendingDisc) {
//        if (!pendingDiscRepository.existsById(id)) throw new IdNotFoundException(id);
//        PendingDisc pendingDisc = pendingDiscRepository.findById(id).get();
//        pendingDisc.setPassword(newPendingDisc.getPassword());
//        pendingDisc.setEmailAdress(newPendingDisc.getEmailAdress());
//        pendingDiscRepository.save(pendingDisc);
//    }
//    voor nu hoeft dit niet te kunnen updaten


    public static PendingDiscDto fromPendingDisc(PendingDisc pendingDisc){

        var dto = new PendingDiscDto();

        dto.name = pendingDisc.getName();
        dto.brand = pendingDisc.getBrand();
        dto.model = pendingDisc.getModel();

        return dto;
    }

    public PendingDisc toPendingDisc(PendingDiscDto pendingDiscDto) {

        var pendingDisc = new PendingDisc();

        pendingDisc.setCreatedDate(pendingDiscDto.getCreatedDate());
        pendingDisc.setName(pendingDiscDto.getName());
        pendingDisc.setBrand(pendingDiscDto.getBrand());
        pendingDisc.setModel(pendingDiscDto.getModel());
        pendingDisc.setWidth(pendingDiscDto.getWidth());
        pendingDisc.setCapacity(pendingDiscDto.getCapacity());
        pendingDisc.setRimWidth(pendingDiscDto.getRimWidth());
        pendingDisc.setReusable(pendingDiscDto.isReusable());
        pendingDisc.setHasStem(pendingDiscDto.isHasStem());
        pendingDisc.setDesignFeature(pendingDiscDto.getDesignFeature());
        pendingDisc.setShape(pendingDiscDto.getShape());
        pendingDisc.setFirmness(pendingDiscDto.getFirmness());
        pendingDisc.setLinkToStore(pendingDiscDto.getLinkToStore());
        pendingDisc.setLinkToReview(pendingDiscDto.getLinkToReview());
        pendingDisc.setImage(pendingDiscDto.getImage());
        pendingDisc.setAvailableInNL(pendingDiscDto.isAvailableInNL());
        pendingDisc.setMaterial(pendingDiscDto.getMaterial());

        return pendingDisc;
    }

}
