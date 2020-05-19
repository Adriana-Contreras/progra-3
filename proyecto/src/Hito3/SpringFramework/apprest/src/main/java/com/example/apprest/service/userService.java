package com.example.apprest.service;

import org.springframework.stereotype.Service;

@Service
public class userService implements  userServiceInterface{

    public  String getName(String name){
        return "mi primer servico REST by: "+ name ;
    }
}
