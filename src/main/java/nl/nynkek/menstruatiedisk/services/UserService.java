package nl.nynkek.menstruatiedisk.services;

import nl.nynkek.menstruatiedisk.dtos.UserDto;
import nl.nynkek.menstruatiedisk.models.User;
import nl.nynkek.menstruatiedisk.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        List<User> users = userRepository.findAll();
        return users;
    }

    public UserDto getUser(String id) {
        User user = userRepository.findById(id).get();
        UserDto dto = fromUser(user);
        return dto;
    }


    public static UserDto fromUser(User user){

        var dto = new UserDto();

        dto.username = user.getUsername();
        dto.password = user.getPassword();
        dto.emailAdress = user.getEmailAdress();
        dto.role = user.getRole();
//        dto.pendingDiscs = user.getPendingDiscs();

        return dto;
    }

    public User toUser(UserDto userDto) {

        var user = new User();

        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setEmailAdress(userDto.getEmailAdress());
        user.setRole(userDto.getRole());
//        user.addRole("ROLE_USER");

        return user;
    }


}
