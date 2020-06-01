package com.example.swing.Repository;

import com.example.swing.Model.ButtonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ButtonRepository extends JpaRepository<ButtonModel, Integer> {

    @Query(value = "select * from button order by random() limit 1 ", nativeQuery = true)
   public ButtonModel getTitleButton();


}
