package com.example.Corona_virus_paciente.service;

import com.example.Corona_virus_paciente.model.CoronaVirusModel;
import com.example.Corona_virus_paciente.repo.CoronaRepo;
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


        if(pModel.getEdad() > 20){
            pModel.setCategoria("ADULTO");
           String nombrecompleto = (pModel.getNombrepaciente() + "   "+pModel.getApellidos());
            pModel.setFullname(nombrecompleto );

        }
        else if(pModel.getEdad() < 20 && pModel.getEdad() > 10  ){
            pModel.setCategoria("Adolecente");
            String nombrecompleto  = (pModel.getNombrepaciente() + "   "+pModel.getApellidos());
            pModel.setFullname(nombrecompleto );
        }
         if(pModel.getEdad() < 10){
            pModel.setCategoria("ninhio");
            String nombrecompleto  = (pModel.getNombrepaciente() + "   "+pModel.getApellidos());
           pModel.setFullname(nombrecompleto );
        }
        else {
            pModel.setCategoria("ERROR");
        }

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
            personaUpdate.setNombrepaciente(pModel.getNombrepaciente());
            personaUpdate.setEdad(pModel.getEdad());
            if (pModel.getEdad() >= 20) {
                personaUpdate.setCategoria("Adulto");
            } else if (pModel.getEdad() <= 20 ) {
                 personaUpdate.setCategoria(" Adolecente ");
            } else if (pModel.getEdad() <= 10) {
                personaUpdate.setCategoria("ninhio");
            }
            personaUpdate.setFullname(pModel.getFullname());
            personaUpdate.setCategoria(pModel.getCategoria());
            personaUpdate.setApellidos(pModel.getApellidos());

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

    @Override
    public Integer deleteTodo() {
        return null;
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
    /// no registrar si es mayor a 70



}
