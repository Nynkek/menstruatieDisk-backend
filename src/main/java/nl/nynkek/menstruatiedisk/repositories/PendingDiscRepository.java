package nl.nynkek.menstruatiedisk.repositories;

import nl.nynkek.menstruatiedisk.models.PendingDisc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PendingDiscRepository extends JpaRepository<PendingDisc, Long> {
}
