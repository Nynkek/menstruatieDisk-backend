package nl.nynkek.menstruatiedisk.services;

import nl.nynkek.menstruatiedisk.models.Brand;
import nl.nynkek.menstruatiedisk.repositories.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {

    private final BrandRepository brandRepository;

    @Autowired
    public BrandService(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    public List<Brand> getBrands() {
        List<Brand> brands = brandRepository.findAll();
        return brands;
    }

    public Brand getBrand(Long id) {
        Brand brand = brandRepository.findById(id).get();
        return brand;
    }
}
