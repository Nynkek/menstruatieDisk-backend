package nl.nynkek.menstruatiedisk.controllers;

import nl.nynkek.menstruatiedisk.models.User;
import nl.nynkek.menstruatiedisk.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    private UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public ResponseEntity<List<User>> getUser() {
        List<User> dtos;

        dtos = userService.getUsers();

        return ResponseEntity.ok().body(dtos);
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/{username}")
    public User getUserByUsername(@PathVariable int username) {
        return userService.getUser(username);
    }

}

