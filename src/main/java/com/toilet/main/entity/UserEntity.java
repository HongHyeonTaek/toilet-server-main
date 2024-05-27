package com.toilet.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class UserEntity {

    @Id
    private String id;
    private String password;

    // Getters and Setters
}