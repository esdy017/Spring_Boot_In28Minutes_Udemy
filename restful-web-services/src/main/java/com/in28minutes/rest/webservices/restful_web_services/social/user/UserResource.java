package com.in28minutes.rest.webservices.restful_web_services.social.user;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {
    private UserDAOService userDAOService;

    public UserResource(UserDAOService userDAOService) {
        this.userDAOService = userDAOService;
    }

    //    GET /users
    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return userDAOService.findAll();
    }

    //    GET /user
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id) {
        User user = userDAOService.findOne(id);
        if (user == null)
            throw new UserNotFoundException("ID: " + id);
        return user;
    }

    //    POST /user
    @PostMapping("/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
        User savedUser = userDAOService.save(user);
        URI location = ServletUriComponentsBuilder
                        .fromCurrentRequest()
                        .path("/{id}")
                        .buildAndExpand(savedUser.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    //    DELETE /user
    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id) {
        userDAOService.deleteById(id);
    }

}
