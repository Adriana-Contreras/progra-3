package com.example.Corona_virus_paciente.service;

import com.example.Corona_virus_paciente.model.CoronaVirusModel;

import java.util.List;

public interface CoronaServiceInterfaz {
    public CoronaVirusModel save(CoronaVirusModel pModel);
    public CoronaVirusModel update(CoronaVirusModel  pModel, Integer idPer);
    public Integer delete(Integer idPer);
    public Integer deleteTodo();
    public List<CoronaVirusModel > getAllPersons();
    public CoronaVirusModel  getPersonByIdPer(Integer idPer);
}
