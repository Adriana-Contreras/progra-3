package com.example.swing.Gui.Panels;

import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class EmplyPanel extends JPanel {


    public EmplyPanel(){
        this.setPreferredSize( new Dimension(500,100));
        this.setBackground(Color.CYAN);
        this.setLayout(new GridLayout(2,1));//``
       // this.setVisible(true);

    }

}
//    @PostConstruct
//    public void createEmptyPanel(){
//        String titleBut = buttonService.getRowRegistro();
//        JButton custonButton = new JButton("Button title");
//        custonButton.setPreferredSize(new Dimension(200,100)); //ancho, alto
//        this.add(custonButton);
//}


