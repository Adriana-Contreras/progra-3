package com.example.apprest.service;


import com.example.apprest.model.personaModel;
import com.example.apprest.repo.personaRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements peronaServiceInterfaz {
    private personaRepo PersonaRepo1;

    //   // guardar
    @Override
    public personaModel save(personaModel pModel) {
        return PersonaRepo1.save(pModel);
    }

    //modificar
    @Override
    public personaModel update(personaModel pModel, Integer idPer){
        Optional<personaModel> person = PersonaRepo1.findById(idPer);
        personaModel personaUpdate = null;

        if (person.isPresent()) {
            personaUpdate = person.get();
            personaUpdate.setNombres(pModel.getNombres());
            personaUpdate.setApellidos(pModel.getApellidos());
            personaUpdate.setEmail(pModel.getEmail());
            personaUpdate.setFechaNac(pModel.getFechaNac());
            PersonaRepo1.save(personaUpdate);
        }
        return personaUpdate;
    }

    //eliminar
    @Override
    public Integer delete(Integer idPer) {
        PersonaRepo1.deleteById(idPer);
        return 1;
    }

  //leer todas personas
    @Override
    public List<personaModel> getAllPersons() {
        List<personaModel> persons = new ArrayList<personaModel>();
        PersonaRepo1.findAll().forEach(persons::add);

        return persons; //creo que es persons
    }

    @Override
    public personaModel getPersonByIdPer(Integer idPer) {
        Optional<personaModel> person = PersonaRepo1.findById(idPer);
        personaModel pModel = null;

        if (person.isPresent()) {
            pModel = person.get();
        }
        return pModel;
    }



}
