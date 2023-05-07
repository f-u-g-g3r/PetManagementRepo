package com.petmanagement.controllers;

import com.petmanagement.model.User;
import com.petmanagement.service.PetsService;
import com.petmanagement.service.UsersService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UsersService usersService;
    private final PetsService petsService;

    public UserController(UsersService usersService, PetsService petsService) {
        this.usersService = usersService;
        this.petsService = petsService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = usersService.findAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/findUser/{username}")
    public ResponseEntity<User> getUserByUsername(@PathVariable("username") String username) {
        User user = usersService.findUserByUsername(username);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
