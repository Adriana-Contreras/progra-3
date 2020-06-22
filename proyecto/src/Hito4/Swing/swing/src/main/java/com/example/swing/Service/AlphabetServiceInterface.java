package com.example.swing.Service;

import com.example.swing.Model.AlphabetModel;

import java.util.List;

public interface AlphabetServiceInterface {
  public void saveData();
  public List<AlphabetModel> getAllLettersFist();
  public List<AlphabetModel> getAllLettersSecond();
  public List<AlphabetModel> getAllLettersThree();

}
