package com.example.Corona_virus_paciente.repo;

import com.example.Corona_virus_paciente.model.CoronaVirusModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoronaRepo extends JpaRepository<CoronaVirusModel, Integer> {
}
