package com.example.swing.Gui.Listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton currentButton = (JButton) e.getSource();
        JOptionPane.showMessageDialog(null,"valor ->"+currentButton.getText());
       // JOptionPane.showMessageDialog(null, "Button Pressed -> " + currentButton.setText(JTextField));
    }
}
