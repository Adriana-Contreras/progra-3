package com.example.swing.Service;

import com.example.swing.Model.AlphabetModel;
import com.example.swing.Repository.AlphabetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlphabetService implements AlphabetServiceInterface {

    private static final String Q_P = "Q,W,E,R,T,Y,U,I,O,P";
    private static final String A_L = "A,S,D,F,G,H,J,K,L";
    private static final String Z_M = "Z,X,C,V,B,N,M";
    @Autowired
    private AlphabetRepository alphabetRepository;

    @Override
    public void saveData() {
        if (alphabetRepository.count() == 0) {
            alphabetRepository.save(new AlphabetModel(Q_P));
            alphabetRepository.save(new AlphabetModel(A_L));
            alphabetRepository.save(new AlphabetModel(Z_M));
        }
    }
    @Override
    public List<AlphabetModel> getAllLettersFist() {
        return new ArrayList<AlphabetModel>(alphabetRepository.findAll());

    }

    @Override
    public List<AlphabetModel> getAllLettersSecond() {
        return null;
    }

    @Override
    public List<AlphabetModel> getAllLettersThree() {
        return null;
    }


}


