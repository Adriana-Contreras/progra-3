package com.example.swing.Gui.Panels;

import com.example.swing.Model.ButtonModel;
import com.example.swing.Service.ButtonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.List;


@Component
public class ButtonPanel  extends JPanel {
    @Autowired
    private ButtonService buttonService;
     public ButtonPanel (){
         this.setPreferredSize(new Dimension(400,200));
         this.setBackground(Color.blue);
         this.setLayout(new GridLayout(3,0));


     }
     @PostConstruct
      public  void createButtons(){
         JPanel mainPanel = new JPanel();
         mainPanel.setLayout(new FlowLayout());

         List<ButtonModel> AllTitles = buttonService.getAllTitleButton();

         AllTitles.forEach(buttonModel -> {
             JButton button = new JButton(buttonModel.getTitleButton());
             button.setPreferredSize(new Dimension(40,40));
             mainPanel.add(button);
         });

         this.add(mainPanel);

     }
}
