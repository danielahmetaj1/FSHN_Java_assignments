import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Palindrome_ush1 extends JFrame implements ActionListener {
    private final JTextField inputField;
    private final JLabel resultLabel;
    
    public Palindrome_ush1() {
        setTitle("Palindrome Checker");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JLabel instructionLabel = new JLabel("Enter a string to check:");
        inputField = new JTextField(20);
        JButton checkButton = new JButton("Check");
        resultLabel = new JLabel("");
        add(instructionLabel);
        add(inputField);
        add(checkButton);
        add(resultLabel);
        checkButton.addActionListener(this);
        setVisible(true);
    }

    public boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        return isPalindrome(str.substring(1, str.length() - 1));
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String input = inputField.getText();
        boolean isPal = isPalindrome(input);
        if (isPal) {
            resultLabel.setText("\"" + input + "\" is a palindrome!");
        } else {
            resultLabel.setText("\"" + input + "\" is not a palindrome.");
        }
    }
    
    public static void main(String[] args) {

        SwingUtilities.invokeLater(Palindrome_ush1::new);
    }
}