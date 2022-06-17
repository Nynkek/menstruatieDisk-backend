package nl.nynkek.menstruatiedisk.repositories;

import nl.nynkek.menstruatiedisk.models.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}
