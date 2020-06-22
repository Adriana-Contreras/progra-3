package com.example.swing.Gui.Panels;

import com.example.swing.Gui.Listener.ButtonListener;
import com.example.swing.Model.AlphabetModel;
import com.example.swing.Service.AlphabetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.List;

@Component
public class AlphabetPanel extends JPanel {
    @Autowired
    private AlphabetService alphabetService;

    public AlphabetPanel() {
        System.setProperty("butBackColor", "#C1ECF1");
        System.setProperty("textColor", "#0B0BF6");

        this.setPreferredSize(new Dimension(600, 300));//--190
        this.setBackground(Color.blue);
        this.setLayout(new GridLayout(5, 0));

    }


    @PostConstruct
    public void createButtonsLetters() {

        List<AlphabetModel> firstRow = alphabetService.getAllLettersFirst();
        String[] titleAlphabet = firstRow.get(0).getLetter().split(",");
        JPanel panelQ_P = this.createPanelButton(titleAlphabet);
        this.add(panelQ_P);

        List<AlphabetModel> secondRow = alphabetService.getAllLettersSecond();
        String[] titleAlphabet1 = secondRow.get(0).getLetter().split(",");
        JPanel panelA_L = this.createPanelButton(titleAlphabet1);
        this.add(panelA_L);

        List<AlphabetModel> threeRow = alphabetService.getAllLettersThree();
        String[] titleAlphabet2 = threeRow.get(0).getLetter().split(",");
        JPanel panelZ_M = this.createPanelButton(titleAlphabet2);
        this.add(panelZ_M);


        JPanel botonera = this.crearEditText();
        this.add(botonera);


        JPanel botonera2 = this.crearEditText2();
        this.add(botonera2);
    }

    public JPanel createPanelButton(String[] titleAlphabet) {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        ButtonListener listener = new ButtonListener();

        for (String title : titleAlphabet) {
            JButton button = new JButton(title);
            button.setPreferredSize(new Dimension(55, 40));
            button.addActionListener(listener);
            button.setBackground(Color.getColor("butBackColor"));
            button.setForeground(Color.getColor("textColor"));
            button.setBorder(BorderFactory.createEmptyBorder());
            //button.setFont(Util.FONT_TEXT);
            mainPanel.add(button);
        }
        return mainPanel;
    }


    //    public void createButtonsLabel() {
//        JPanel botonera = this.crearEditText();
//        this.add(botonera);
//    }
    @PostConstruct
    public JPanel crearEditText() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());

        JLabel Jlword = new JLabel("WORD:");
        Jlword.setPreferredSize(new Dimension(50, 40));
        mainPanel.add(Jlword);


        JTextField caja1 = new JTextField();//CAJAA
        caja1.setPreferredSize(new Dimension(100, 30));
        mainPanel.add(caja1);

        JLabel Jlenguaje = new JLabel("LANGUAGE:");
        Jlenguaje.setPreferredSize(new Dimension(75, 40));
        mainPanel.add(Jlenguaje);

        JTextField caja2 = new JTextField();
        caja2.setPreferredSize(new Dimension(100, 30));
        mainPanel.add(caja2);


        JLabel JResult = new JLabel("RESULT.");
        JResult.setPreferredSize(new Dimension(60, 40));
        mainPanel.add(JResult);

        JTextField caja3 = new JTextField();
        caja3.setPreferredSize(new Dimension(100, 30));
        mainPanel.add(caja3);

        return mainPanel;
    }

    @PostConstruct
    public JPanel crearEditText2() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());


        JButton B1 = new JButton();//CAJAA
        B1.setPreferredSize(new Dimension(100, 30));
        B1.setText("TRADUCIR");
        mainPanel.add(B1);


        JButton B2 = new JButton();
        B2.setPreferredSize(new Dimension(100, 30));
        B2.setText("CLEAR");

        mainPanel.add(B2);




        return mainPanel;
    }







}