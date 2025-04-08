/*2. Krijoni një aplikacion në JAVA që mban një label, një textField dhe një buton. Vlera fillestare e
textField është 0. Sa herë klikoni në buton, vlera e textField rritet me një.*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ush2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Counter App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Counter:");
        JTextField textField = new JTextField("0", 5);
        textField.setEditable(false);
        JButton button = new JButton("Increment");

        button.addActionListener(new ActionListener() {
            int count = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                textField.setText(String.valueOf(count));
            }
        });

        frame.add(label);
        frame.add(textField);
        frame.add(button);

        frame.setVisible(true);
    }
}
