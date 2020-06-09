package com.example.swing.Service;

import com.example.swing.Model.ButtonModel;

import java.util.List;

public interface DicconaryServiceInterface {
    public void saveData();
    public String getRow();
    public List<ButtonModel> getAllTitleButton();
}
