package nl.nynkek.menstruatiedisk.services;

import nl.nynkek.menstruatiedisk.dtos.DiscDto;
import nl.nynkek.menstruatiedisk.exeptions.RecordNotFoundException;
import nl.nynkek.menstruatiedisk.models.Disc;
import nl.nynkek.menstruatiedisk.repositories.DiscRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiscService {

    private final DiscRepository discRepository;

    @Autowired
    public DiscService(DiscRepository discRepository) {
        this.discRepository = discRepository;
    }

    public List<Disc> getDiscs() {
        List<Disc> discs = discRepository.findAll();
        return discs;
    }

//    public Disc getDisc(Long id) {
//        Disc disc = discRepository.findById(id).get();
//        if (disc == null)
//            throw new
//
//        System.out.println("HALLO" + disc);
//        return disc;
//    }

    public Long createDisc(DiscDto discDto) {
        Disc newDisc = discRepository.save(toDisc(discDto));
        return newDisc.getId();
    }

    public static DiscDto transferToDto(Disc disc) {
        var dto = new DiscDto();

        dto.id = disc.getId();
        dto.name = disc.getName();
        dto.brand = disc.getBrand();
        dto.model = disc.getModel();
        dto.width = disc.getWidth();
        dto.capacity = disc.getCapacity();
        dto.rimWidth = disc.getRimWidth();
        dto.isReusable = disc.isReusable();
        dto.hasStem = disc.isHasStem();
        dto.designFeature = disc.getDesignFeature();
        dto.shape = disc.getShape();
        dto.firmness = disc.getFirmness();
        dto.linkToStore = disc.getLinkToStore();
        dto.linkToReview = disc.getLinkToReview();
        dto.image = disc.getImage();
        dto.isAvailableInNL = disc.isAvailableInNL();
        dto.material = disc.getMaterial();

        return dto;
    }

    public Disc toDisc(DiscDto discDto) {

        var disc = new Disc();

        disc.setCreatedDate(discDto.getCreatedDate());
        disc.setName(discDto.getName());
        disc.setBrand(discDto.getBrand());
        disc.setModel(discDto.getModel());
        disc.setWidth(discDto.getWidth());
        disc.setCapacity(discDto.getCapacity());
        disc.setRimWidth(discDto.getRimWidth());
        disc.setReusable(discDto.isReusable());
        disc.setHasStem(discDto.isHasStem());
        disc.setDesignFeature(discDto.getDesignFeature());
        disc.setShape(discDto.getShape());
        disc.setFirmness(discDto.getFirmness());
        disc.setLinkToStore(discDto.getLinkToStore());
        disc.setLinkToReview(discDto.getLinkToReview());
        disc.setImage(discDto.getImage());
        disc.setAvailableInNL(discDto.isAvailableInNL());
        disc.setMaterial(discDto.getMaterial());

        return disc;
    }


    public DiscDto getDisc(Long id) {
        Optional<Disc> disc = discRepository.findById(id);
        if(disc.isPresent()) {
            DiscDto disc1 = transferToDto(disc.get());
            return disc1;
        } else {
            throw new RecordNotFoundException("No disc found");
        }
    }
}

