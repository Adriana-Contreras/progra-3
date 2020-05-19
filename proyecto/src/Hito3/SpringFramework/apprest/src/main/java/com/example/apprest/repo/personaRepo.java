package com.example.apprest.repo;

import com.example.apprest.model.personaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface personaRepo extends JpaRepository<personaModel, Integer> {
}
