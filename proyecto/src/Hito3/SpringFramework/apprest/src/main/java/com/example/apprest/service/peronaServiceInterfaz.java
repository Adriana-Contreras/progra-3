package com.example.apprest.service;

import com.example.apprest.model.personaModel;

import java.util.List;

public interface peronaServiceInterfaz {
    public personaModel save(personaModel pModel);
    public personaModel update(personaModel pModel, Integer idPer);
    public  Integer delete(Integer idPer);
    public List<personaModel> getAllPersons();
    public personaModel getPersonByIdPer(Integer idPer);
}
