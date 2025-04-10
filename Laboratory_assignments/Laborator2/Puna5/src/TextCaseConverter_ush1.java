/*1. Ndërtoni një aplikacion i cili do të përmbajë një frame, me një textArea ku do te
afishohet një tekst. Të shtohen 2 butona: “To Lower Case”, dhe “To Upper Case”
që do te kthejnë tekstin në shkronja të vogla ose të mëdha në varësi të butonit të
zgjedhur.*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TextCaseConverter_ush1 extends JFrame {
    private final JTextArea textArea;

    public TextCaseConverter_ush1() {
        setTitle("Text Case Converter");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textArea = new JTextArea("Shkruani nje tekst->");
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();

        JButton toLowerCaseButton = new JButton("To Lower Case");
        toLowerCaseButton.addActionListener((ActionEvent _) ->
                textArea.setText(textArea.getText().toLowerCase()));

        JButton toUpperCaseButton = new JButton("To Upper Case");
        toUpperCaseButton.addActionListener((ActionEvent _) ->
                textArea.setText(textArea.getText().toUpperCase()));

        buttonPanel.add(toLowerCaseButton);
        buttonPanel.add(toUpperCaseButton);

        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new TextCaseConverter_ush1();
    }
}
