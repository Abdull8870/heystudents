package com.api.heystudent.entity;

import jakarta.validation.constraints.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id()
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @NotNull
    private String firstName;

    private String lastName;

    @NotNull
    private String email;

    @NotNull
    private String password;    
    
}
