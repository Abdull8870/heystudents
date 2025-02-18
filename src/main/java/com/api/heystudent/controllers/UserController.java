package com.api.heystudent.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.heystudent.dto.UserDto;
import com.api.heystudent.entity.User;
import com.api.heystudent.services.UserService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class UserController {

    private UserService userService;

   @GetMapping("/hello") 
   public String hello() {
    return "Hello World";
   }
    
   @PostMapping("/user/register")
   public UserDto registerUser(@RequestBody User user) {
    return this.userService.registerUser(user);
   }

}
