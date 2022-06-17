package nl.nynkek.menstruatiedisk.controllers;

import nl.nynkek.menstruatiedisk.models.Brand;
import nl.nynkek.menstruatiedisk.services.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BrandController {
    private final BrandService brandService;

    @Autowired
    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/brands")
    public List<Brand> getBrands() {
        return brandService.getBrands();
    }

    @GetMapping("/brand/{id}")
    public Brand getBrandById(@PathVariable("id") Long id) {
        Brand brand = brandService.getBrand(id);
        return brand;
    }
}
