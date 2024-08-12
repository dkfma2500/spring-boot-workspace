package com.example.ex15_jpa.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyUserRepository extends JpaRepository<Myuser, String>{
    
}
