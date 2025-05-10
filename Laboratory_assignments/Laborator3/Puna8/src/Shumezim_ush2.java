/*2. Krijoni një metodë rekursive për shumëzimin e dy numrave (vlerat
të merren nga përdoruesi nëpërmjet JTextField).*/
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

public class Shumezim_ush2 extends JFrame implements ActionListener {
    private final JTextField inputField1;
    private final JTextField inputField2;
    private final JLabel resultLabel;

    public Shumezim_ush2() {
        setTitle("Shumezim");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JLabel instructionLabel = new JLabel("Shumezimi i dy numrave:");
        JButton checkButton = new JButton("Shumezim");
        inputField1 = new JTextField(10);
        inputField2 = new JTextField(10);
        resultLabel = new JLabel("");
        add(instructionLabel);
        add(inputField1);
        add(inputField2);
        add(checkButton);
        add(resultLabel);
        checkButton.addActionListener(this);
        setVisible(true);
    }
    public int multiply(int a, int b) {
        if (b == 1) {
            return a;
        }
        return a + multiply(a, b - 1);
    }
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        int a = Integer.parseInt(inputField1.getText());
        int b = Integer.parseInt(inputField2.getText());
        int result = multiply(a, b);
        resultLabel.setText("Rezultati: " + result);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Shumezim_ush2::new);
    }
}
