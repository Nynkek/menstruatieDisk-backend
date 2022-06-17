package nl.nynkek.menstruatiedisk.services;

import nl.nynkek.menstruatiedisk.dtos.UserDto;
import nl.nynkek.menstruatiedisk.exeptions.UsernameNotFoundException;
import nl.nynkek.menstruatiedisk.models.PendingDisc;
import nl.nynkek.menstruatiedisk.models.User;
import nl.nynkek.menstruatiedisk.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class UserService {


    @Autowired
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDto> getUsers() {
        List<UserDto> collection = new ArrayList<>();
        List<User> list = userRepository.findAll();
        for (User user : list) {
            collection.add(fromUser(user));
        }
        return collection;
    }

    public UserDto getUser(String username) {
        UserDto dto = new UserDto();
        Optional<User> user = userRepository.findById(username);
        if (user.isPresent()){
            dto = fromUser(user.get());
        }else {
            throw new UsernameNotFoundException(username);
        }
        return dto;
    }


    public boolean userExists(String username) {
        return userRepository.existsById(username);
    }

    public String createUser(UserDto userDto) {
        User newUser = userRepository.save(toUser(userDto));
        return newUser.getUsername();
    }

    public void deleteUser(String username) {
        userRepository.deleteById(username);
    }

    public void updateUser(String username, UserDto newUser) {
        if (!userRepository.existsById(username)) throw new UsernameNotFoundException(username);
        User user = userRepository.findById(username).get();
        user.setPassword(newUser.getPassword());
        user.setEmailAdress(newUser.getEmailAdress());
        userRepository.save(user);
    }

    // keuze: username is de unique sleutel/id. dus die mag je niet aanpassen. Expres!

    // als er nog een pending disc aan gebruiker gekoppeld is mag je de user niet verwijderen.

    public static UserDto fromUser(User user){

        var dto = new UserDto();

        dto.username = user.getUsername();
        dto.password = user.getPassword();
        dto.emailAdress = user.getEmailAdress();

//        dto.pendingDiscs = user.getPendingDiscs().stream().map(pendingDisc -> {
//            return pendingDisc.getId();
//        }).toList();

        return dto;
    }

    public User toUser(UserDto userDto) {

        var user = new User();

        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setEmailAdress(userDto.getEmailAdress());
//        user.addRole("ROLE_USER");

        return user;
    }

}


