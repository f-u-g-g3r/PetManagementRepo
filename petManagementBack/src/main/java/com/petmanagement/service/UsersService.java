package com.petmanagement.service;

import com.petmanagement.model.User;
import com.petmanagement.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    private final UsersRepository usersRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository) { this.usersRepository = usersRepository; }

    public List<User> findAllUsers() {
        return usersRepository.findAll();
    }

    public User findUserByUsername(String username) { return usersRepository.findUserByUsername(username); }

}
