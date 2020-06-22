package com.example.swing.Service;

import com.example.swing.Model.ButtonModel;
import com.example.swing.Repository.ButtonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ButtonService implements  ButtonServiceInterface {
    private static final String TITLE_BUTTONS= "Save,delete,Cancel,Login,Logout,Update";
   @Autowired
    private ButtonRepository buttonRepository;

    //guarda en la base de datos
    @Override
    public void saveData() {
        if (buttonRepository.count() ==0)
        {
            String titleButtons[]= TITLE_BUTTONS.split(",");
            for(String titleButton : titleButtons){
                buttonRepository.save(new ButtonModel(titleButton));
            }

//            titleButtons[0]= "Save";
//            titleButtons[1]= "Delete";
//            titleButtons[2]= "Cancel";


//        buttonRepository.save(new ButtonModel("Log In"));
        }
        //System.out.println("ButtonService.saveData");
       // buttonModel.setTitleButton("ingresar");

       // buttonRepository.save(new ButtonModel("Ingresar"));
       // buttonRepository.save(new ButtonModel("Registrar"));
    }

    //lee registro
    @Override
    public String getRowRegistro(){
//    buttonRepository.getTitleButton();
//    return null;
    ButtonModel bModel = buttonRepository.getTitleButton();
    //String titleButton = bModel.getTitleButton();
    return  bModel.getTitleButton();
    }

    @Override
    public List<ButtonModel> getAllTitleButton(){
//        List<ButtonModel> allTitles = new ArrayList<ButtonModel>();
//        buttonRepository.findAll().forEach(allTitles());
//        return null;
        return  new ArrayList<ButtonModel>(buttonRepository.findAll());
    }


}
