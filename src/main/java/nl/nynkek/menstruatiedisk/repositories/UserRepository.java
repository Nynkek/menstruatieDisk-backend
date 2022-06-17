package nl.nynkek.menstruatiedisk.repositories;

import nl.nynkek.menstruatiedisk.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
