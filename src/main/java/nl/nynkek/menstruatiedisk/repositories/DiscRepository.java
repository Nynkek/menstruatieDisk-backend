package nl.nynkek.menstruatiedisk.repositories;

import nl.nynkek.menstruatiedisk.models.Disc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscRepository extends JpaRepository<Disc, Long> {

}
