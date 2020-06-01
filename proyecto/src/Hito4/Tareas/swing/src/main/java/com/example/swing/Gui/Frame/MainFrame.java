package com.example.swing.Gui.Frame;

import com.example.swing.Gui.Panels.AlphabetPanel;
import com.example.swing.Gui.Panels.ButtonPanel;
import com.example.swing.Gui.Panels.EmplyPanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

@Component
public class MainFrame extends JFrame {
    @Autowired
    private EmplyPanel emplypanel;
    @Autowired
    private ButtonPanel buttonPanel;
    @Autowired
    private AlphabetPanel alphabetPanel;

    public MainFrame(){
        this.setTitle("Swing Progra III");
        this.setBounds(300,200, 800, 600);//x,y,ancho.largo
        this.setBackground(Color.CYAN);
        this.setLayout(new GridLayout(2,0));
       // this.setVisible(true);
    }
    @PostConstruct
    public void createdManFrame() {

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout());

        addPanels(container);

        this.add(container);
        this.setVisible(true);

    }
    public void addPanels(JPanel container) {

        container.add(alphabetPanel);
        container.add(emplypanel);
       // this.setVisible(true);


    }
}
