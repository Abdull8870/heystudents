package com.api.heystudent.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.heystudent.entity.User;

public interface UserRepository extends JpaRepository<User, String> {  

    Optional<User> findByEmail(String email);

    Optional<User> findById(String id);
    
}
