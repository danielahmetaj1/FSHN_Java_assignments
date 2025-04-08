/*2. Krijoni nje aplikacion ne JAVA qe merr nga perdoruesi 2 numra (2 textField). Ne klik te 2
butonave llogaritni perkatesisht shumen dhe prodhimin e tyre.*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp_ush2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Kalkulatori i Thjeshte");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(3, 2));
        JLabel label1 = new JLabel("Numri 1:");
        JTextField textField1 = new JTextField();
        JLabel label2 = new JLabel("Numri 2:");
        JTextField textField2 = new JTextField();
        JButton addButton = new JButton("Shuma");
        JButton multiplyButton = new JButton("Prodhimi");
        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(addButton);
        frame.add(multiplyButton);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(textField1.getText());
                    double num2 = Double.parseDouble(textField2.getText());
                    double sum = num1 + num2;
                    JOptionPane.showMessageDialog(frame, "Shuma: " + sum);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Ju lutem fusni numra te vlefshem!", "Gabim", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(textField1.getText());
                    double num2 = Double.parseDouble(textField2.getText());
                    double product = num1 * num2;
                    JOptionPane.showMessageDialog(frame, "Prodhimi: " + product);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Ju lutem fusni numra te vlefshem!", "Gabim", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        frame.setVisible(true);
    }
}
