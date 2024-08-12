package com.example.ex15_jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ex15_jpa.entity.MyUserRepository;
import com.example.ex15_jpa.entity.Myuser;

@Service
public class MyUserService {
    @Autowired
    private static MyUserRepository myUserRepository;

    public static List<Myuser> list() {
        return myUserRepository.findAll();
    }
}
