package nl.nynkek.menstruatiedisk.services;

import nl.nynkek.menstruatiedisk.models.User;
import nl.nynkek.menstruatiedisk.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        List<User> users = userRepository.findAll();
        return users;
    }

    public User getUser(int id) {
        User user = userRepository.getById((long) id);
        return user;
    }
}
