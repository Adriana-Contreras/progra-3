package com.example.casos_corona_virus.Repo;

import com.example.casos_corona_virus.model.CoronaVirusModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoronaRepo extends JpaRepository<CoronaVirusModel, Integer> {

}
