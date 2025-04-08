/*1. Krijoni një aplikacion në JAVA që merr nga përdoruesi emrin dhe mbiemrin e tij, dhe e afishoni
atë (psh: në një label)*/

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ush1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Emri dhe Mbiemri");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JLabel nameLabel = new JLabel("Emri:");
        JTextField nameField = new JTextField(10);
        JLabel surnameLabel = new JLabel("Mbiemri:");
        JTextField surnameField = new JTextField(10);
        JButton submitButton = new JButton("Shfaq");
        JLabel resultLabel = new JLabel(" ");

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(surnameLabel);
        frame.add(surnameField);
        frame.add(submitButton);
        frame.add(resultLabel);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String surname = surnameField.getText();
                resultLabel.setText("Perdoruesi: " + name + " " + surname);
            }
        });
        frame.setVisible(true);
    }
}