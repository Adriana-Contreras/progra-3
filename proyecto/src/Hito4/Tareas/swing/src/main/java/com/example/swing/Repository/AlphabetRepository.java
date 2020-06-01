package com.example.swing.Repository;

import com.example.swing.Model.AlphabetModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AlphabetRepository extends JpaRepository<AlphabetModel, Integer> {
@Query(value = "select  * from alphabet order by id limit 1", nativeQuery =  true)
    public AlphabetModel getLetter();

}
