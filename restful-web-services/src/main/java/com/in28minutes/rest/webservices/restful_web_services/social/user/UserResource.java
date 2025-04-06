package com.in28minutes.rest.webservices.restful_web_services.social.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
        return userDAOService.findOne(id);
    }

}
