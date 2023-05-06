package com.petmanagement.repository;

import com.petmanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Long> {
    User findUserByUsername(String username);
}
