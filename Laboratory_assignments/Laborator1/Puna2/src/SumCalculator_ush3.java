/*3. Krijoni nje aplikacion qe permban 2 label dhe 2 textField. TextField i 2 eshte i paeditueshem.
Nese japim nje vlere numerike tek textField i pare dhe klikojme butonin Enter, ne textField-in e
dyte te lllogaritet shuma e vleres se shtuar (shih figuren)*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumCalculator_ush3 {
    private double sum = 0;
    public SumCalculator_ush3() {
        JFrame frame = new JFrame("Llogaritesi i Shumes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new GridLayout(3, 2));
        JLabel lblInput = new JLabel("Shkruaj nje numer:");
        JTextField txtInput = new JTextField();
        JLabel lblSum = new JLabel("Shuma e pergjithshme:");
        JTextField txtSum = new JTextField("0");
        txtSum.setEditable(false);
        JButton btnCalculate = new JButton("Enter");
        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num = Double.parseDouble(txtInput.getText());
                    sum += num;
                    txtSum.setText(String.valueOf(sum));
                    txtInput.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Ju lutem shkruani nje numer te vlefshem!", "Gabim", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        frame.add(lblInput);
        frame.add(txtInput);
        frame.add(lblSum);
        frame.add(txtSum);
        frame.add(btnCalculate);
        frame.setVisible(true);
    }
    public static void main(String[] args) {

        new SumCalculator_ush3();
    }
}

