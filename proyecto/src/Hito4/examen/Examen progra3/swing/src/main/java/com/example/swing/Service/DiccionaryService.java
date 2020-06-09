package com.example.swing.Service;

import com.example.swing.Model.AlphabetModel;
import com.example.swing.Model.ButtonModel;
import com.example.swing.Model.DiccionaryModel;
import com.example.swing.Repository.AlphabetRepository;
import com.example.swing.Repository.DiccionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DiccionaryService implements DicconaryServiceInterface {



    @Autowired
    private DiccionaryRepository diccionaryRepository;
    @Override
    public void saveData() {

        if (diccionaryRepository.count() == 0) {
            diccionaryRepository.save(new DiccionaryModel("MONDAY","SEGUNDA-FEIRA","LUNES"));
            diccionaryRepository.save(new DiccionaryModel("TUESDAY","TERCA-FEIRA","MARTES"));
            diccionaryRepository.save(new DiccionaryModel("WEDNESDAY","QUARTA-FEIRA","MIERCOLES"));
            diccionaryRepository.save(new DiccionaryModel("THURSDAY","QUINTA-FEIRA","JUEVES"));
            diccionaryRepository.save(new DiccionaryModel("FRIDAY","SEXTA-FEIRA","VIERNES"));
            diccionaryRepository.save(new DiccionaryModel("SATURDAY","SABADO","SABADO"));
            diccionaryRepository.save(new DiccionaryModel("SUNDAY","DOMINGO","DOMINGO"));
        }

    }

    @Override
    public String getRow() {
        return null;
    }

    @Override
    public List<ButtonModel> getAllTitleButton() {
        return null;
    }
}
