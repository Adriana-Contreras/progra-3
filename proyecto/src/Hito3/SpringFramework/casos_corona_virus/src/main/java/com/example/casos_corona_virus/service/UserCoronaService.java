package com.example.casos_corona_virus.service;

import org.springframework.stereotype.Service;

@Service
public class UserCoronaService implements  UserCoronaServiceInterfaz {

    @Override
    public String getName(String name) {
        return "Mi primer servicio REST by :" + name;
    }


}
