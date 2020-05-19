package com.example.casos_corona_virus.service;

import com.example.casos_corona_virus.model.CoronaVirusModel;

import java.util.List;

public interface CoronaServiceInterfaz {
    public CoronaVirusModel save(CoronaVirusModel pModel);
    public CoronaVirusModel update(CoronaVirusModel  pModel, Integer idPer);
    public Integer delete(Integer idPer);
    public List<CoronaVirusModel > getAllPersons();
    public CoronaVirusModel  getPersonByIdPer(Integer idPer);
}
