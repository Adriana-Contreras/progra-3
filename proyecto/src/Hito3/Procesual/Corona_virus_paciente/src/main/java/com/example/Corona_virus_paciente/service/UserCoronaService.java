package com.example.Corona_virus_paciente.service;

public class UserCoronaService implements UserCoronaServiceInterfaz {
    @Override
    public String getName(String name) {
        return "Mi primer servicio REST by :" + name;
    }


}
