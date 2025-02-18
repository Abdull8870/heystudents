package com.api.heystudent.services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.api.heystudent.dto.UserDto;
import com.api.heystudent.entity.User;
import com.api.heystudent.repositories.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;
    private BCryptPasswordEncoder passwordEncoder;

    public UserDto registerUser(User user) {    
        user.setPassword(passwordEncoder.encode(user.getPassword()));   
        User userEntity = userRepository.save(user);
        return  UserDto.builder().
        id(userEntity.getId()).
        firstName(userEntity.getFirstName()).
        lastName(userEntity.getLastName()).
        email(userEntity.getEmail()).
        build();
    }



    

}
