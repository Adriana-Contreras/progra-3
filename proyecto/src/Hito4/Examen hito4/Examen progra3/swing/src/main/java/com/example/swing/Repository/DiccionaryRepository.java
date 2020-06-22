package com.example.swing.Repository;

import com.example.swing.Model.AlphabetModel;
import com.example.swing.Model.DiccionaryModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiccionaryRepository extends JpaRepository<DiccionaryModel, Integer> {


}
