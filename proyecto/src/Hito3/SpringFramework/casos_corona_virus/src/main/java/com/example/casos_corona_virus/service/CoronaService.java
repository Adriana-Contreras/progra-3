package com.example.casos_corona_virus.service;


import com.example.casos_corona_virus.Repo.CoronaRepo;
import com.example.casos_corona_virus.model.CoronaVirusModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CoronaService implements CoronaServiceInterfaz {

    @Autowired
    private CoronaRepo coronaRepo;

    @Override
    public CoronaVirusModel save(CoronaVirusModel pModel) {
        return coronaRepo.save(pModel);
    }
   /// modificar los registros
    @Override
    public CoronaVirusModel update(CoronaVirusModel pModel, Integer idPer) {
        Optional<CoronaVirusModel> registroCoronaVirus = coronaRepo.findById(idPer);
       CoronaVirusModel personaUpdate = null;

        if (registroCoronaVirus.isPresent()) {
            personaUpdate = registroCoronaVirus.get();
            personaUpdate.setNombreDep(pModel.getNombreDep());
            personaUpdate.setCasos_contagiados(pModel.getCasos_contagiados());
            personaUpdate.setCasos_sospechosos(pModel.getCasos_sospechosos());
            personaUpdate.setCasos_recuperados(pModel.getCasos_recuperados());
            coronaRepo.save(personaUpdate);
        }
        return personaUpdate;
    }
    //eliminar mediante id
    @Override
    public Integer delete(Integer idCorona) {
        coronaRepo.deleteById(idCorona);
        return 1;
    }
   //recorre los registros y añade a la lista
    @Override
    public List<CoronaVirusModel> getAllPersons() {
        List<CoronaVirusModel> persons = new ArrayList<CoronaVirusModel>();
        coronaRepo.findAll().forEach(persons::add);

        return persons;
    }
    @Override
    public CoronaVirusModel getPersonByIdPer(Integer idPer) {
        Optional<CoronaVirusModel> person = coronaRepo.findById(idPer);
        CoronaVirusModel pModel = null;

        if (person.isPresent()) {
            pModel = person.get();
        }
        return pModel;
    }





}
