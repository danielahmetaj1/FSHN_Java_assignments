/*1. Krijoni nje aplikacion ne JAVA qe merr nga perdoruesi nje numer ne nje textField. Ne klik te nje
butoni tregoni:
 nese numri eshte çift apo tek
 nese numri eshte pozitiv apo negativ
 vleren absolute te tij*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberChecker_ush1 extends JFrame {
    private JTextField numberField;
    private JButton checkButton;
    private JLabel resultLabel;
    public NumberChecker_ush1() {
        setTitle("Kontrolluesi i Numrave");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        numberField = new JTextField(10);
        checkButton = new JButton("Kontrollo Numrin");
        resultLabel = new JLabel("Vendosni nje numer dhe klikoni butonin.");
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkNumber();
            }
        });
        add(new JLabel("Numri:"));
        add(numberField);
        add(checkButton);
        add(resultLabel);
        setVisible(true);
    }
    private void checkNumber() {
        try {
            int number = Integer.parseInt(numberField.getText());
            String parity = (number % 2 == 0) ? "Cift" : "Tek";
            String sign = (number >= 0) ? "Pozitiv" : "Negativ";
            int absoluteValue = Math.abs(number);
            resultLabel.setText("Numri eshte " + parity + ", " + sign + ", Vlera Absolute: " + absoluteValue);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Ju lutem vendosni nje numer te vlefshem!");
        }
    }
    public static void main(String[] args) {
        new NumberChecker_ush1();
    }
}
