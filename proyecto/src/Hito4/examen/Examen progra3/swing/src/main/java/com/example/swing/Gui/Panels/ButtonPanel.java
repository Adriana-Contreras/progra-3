package com.example.swing.Gui.Panels;

import com.example.swing.Model.ButtonModel;
import com.example.swing.Service.DiccionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.List;


@Component
public class ButtonPanel  extends JPanel {
    @Autowired
    private DiccionaryService buttonService;

     public ButtonPanel (){
         this.setPreferredSize(new Dimension(600,400));
         this.setBackground(Color.blue);
         this.setLayout(new GridLayout(3,0));
     }

     @PostConstruct
      public  void createButtons(){
         JPanel mainPanel = new JPanel();
         mainPanel.setLayout(new FlowLayout());

         List<ButtonModel> AllTitles = buttonService.getAllTitleButton();

         this.add(mainPanel);

     }
}
