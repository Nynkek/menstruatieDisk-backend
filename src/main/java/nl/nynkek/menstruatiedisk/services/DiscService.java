package nl.nynkek.menstruatiedisk.services;

import nl.nynkek.menstruatiedisk.dtos.DiscDto;
import nl.nynkek.menstruatiedisk.dtos.PendingDiscDto;
import nl.nynkek.menstruatiedisk.models.Disc;
import nl.nynkek.menstruatiedisk.models.PendingDisc;
import nl.nynkek.menstruatiedisk.repositories.DiscRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public Disc getDisc(Long id) {
        Disc disc = discRepository.findById(id).get();
        if (disc == null)
            throw new

        System.out.println("HALLO" + disc);
        return disc;
    }

    public Long createDisc(DiscDto discDto) {
        Disc newDisc = discRepository.save(toDisc(discDto));
        return newDisc.getId();
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
    
    
}

