/*
Author: Kevin Darke
Date: 9/26/22
Contact: kevindarke@gmail.com
This class provides a simple GUI and main method to run the SyllableCounter class. It asks the user for a string
input and tells them how many syllables are contained in the String.
 */

package SyllableCounter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JPanel mainPanel;
    private JButton countBtn;
    private JTextField entryField;
    private JLabel entryLabel;
    private JLabel countLabel;
    private JLabel countAnswer;

    GUI(){
        JFrame frame = new JFrame("Syllable Counter");
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(mainPanel);
        frame.setVisible(true);
        countBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String testWord = entryField.getText();
                int syllables = SyllableCounter.countSyllables(testWord);
                countAnswer.setText(String.valueOf(syllables));
            }
        });
    }

    public static void main(String[] args){
        new GUI();
    }
}
