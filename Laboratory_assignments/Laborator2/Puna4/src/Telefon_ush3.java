/*--Ushtrimi 3-- Krijoni nje telefon si ne figure, ne textfield te shfaqet numri i formuar */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Telefon_ush3 extends JFrame {
    private final JTextField textField;
    private final StringBuilder number;

    public Telefon_ush3() {
        setTitle("Telefon");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        JPanel buttonPanel = new JPanel();
        number = new StringBuilder();
        textField = new JTextField(12);
        textField.setEditable(false);

        buttonPanel.setLayout(new GridLayout(4, 3));

        String[] buttons = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};

        for (String btnText : buttons) {
            JButton button = new JButton(btnText);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener((ActionEvent e) -> {
                JButton source = (JButton) e.getSource();
                number.append(source.getText());
                textField.setText(number.toString());
            });
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(new JLabel("Numri:"));
        bottomPanel.add(textField);
        add(bottomPanel, BorderLayout.SOUTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Telefon_ush3();
    }
}
