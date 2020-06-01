package com.example.swing.Gui.Panels;

import com.example.swing.Model.AlphabetModel;
import com.example.swing.Model.ButtonModel;
import com.example.swing.Repository.AlphabetRepository;
import com.example.swing.Service.AlphabetService;
import com.example.swing.Service.ButtonService;
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

    @Autowired
    private AlphabetRepository alphabetRepository;


    public AlphabetPanel(){
        this.setPreferredSize(new Dimension(600,400));//600,400
        this.setBackground(Color.blue);
        this.setLayout(new GridLayout(1,0));


    }


    @PostConstruct
    public  void createButtonsLetters(){
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());

        List<AlphabetModel> AllLetters = alphabetService.getAllLettersFist();

        AllLetters.forEach(AlphabetModel -> {
            String [] LettersButtons = AlphabetModel.getLetter().split(",");
            for(String letters: LettersButtons) {
               if(LettersButtons.length==10) {
                   JButton button = new JButton(letters);
                   button.setPreferredSize(new Dimension(50, 40));//55,50aqui
                   mainPanel.add(button);
               }

            else {
                   break;
               }
            }
        });

        this.add(mainPanel);

    }
}
