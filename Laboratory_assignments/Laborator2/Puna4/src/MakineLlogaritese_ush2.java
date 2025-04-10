/*--Ushtrimi 2--Krijoni një makinë llogaritëse si në figurë:*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MakineLlogaritese_ush2 extends JFrame {

    private final JTextField numri1Field;
    private final JTextField numri2Field;
    private final JTextArea rezultatiArea;
    private final JButton plusBtn;
    private final JButton minusBtn;
    private final JButton multBtn;
    private final JButton divBtn;

    public MakineLlogaritese_ush2() {
        setTitle("Makine llogaritese");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 250);
        setLocationRelativeTo(null); 
        
        numri1Field = new JTextField(8);
        numri2Field = new JTextField(8);
        rezultatiArea = new JTextArea(8, 40);
        rezultatiArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(rezultatiArea);

        plusBtn = new JButton("+");
        minusBtn = new JButton("-");
        multBtn = new JButton("*");
        divBtn = new JButton("/");
        JButton pastroBtn = new JButton("Pastro");

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        topPanel.add(numri1Field);
        topPanel.add(numri2Field);
        topPanel.add(plusBtn);
        topPanel.add(minusBtn);
        topPanel.add(multBtn);
        topPanel.add(divBtn);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        bottomPanel.add(pastroBtn);

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.add(topPanel, BorderLayout.NORTH);
        contentPanel.add(scrollPane, BorderLayout.CENTER);
        contentPanel.add(bottomPanel, BorderLayout.SOUTH);

        ActionListener veprimi = e -> {
            try {
                double nr1 = Double.parseDouble(numri1Field.getText());
                double nr2 = Double.parseDouble(numri2Field.getText());
                double rezultati = 0;
                String simboli = "";

                if (e.getSource() == plusBtn) {
                    rezultati = nr1 + nr2;
                    simboli = "+";
                } else if (e.getSource() == minusBtn) {
                    rezultati = nr1 - nr2;
                    simboli = "-";
                } else if (e.getSource() == multBtn) {
                    rezultati = nr1 * nr2;
                    simboli = "*";
                } else if (e.getSource() == divBtn) {
                    if (nr2 == 0) {
                        rezultatiArea.append("Gabim: Pjestim me zero!\n");
                        return;
                    }
                    rezultati = nr1 / nr2;
                    simboli = "/";
                }

                rezultatiArea.append(String.format("%.6f %s %.6f = %.6f%n", nr1, simboli, nr2, rezultati));
                numri1Field.setText("");
                numri2Field.setText("");
            } catch (NumberFormatException ex) {
                rezultatiArea.append("Ju lutem shkruani numra te vlefshem!\n");
            }
        };

        plusBtn.addActionListener(veprimi);
        minusBtn.addActionListener(veprimi);
        multBtn.addActionListener(veprimi);
        divBtn.addActionListener(veprimi);
        pastroBtn.addActionListener(_ -> rezultatiArea.setText(""));

        add(contentPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MakineLlogaritese_ush2().setVisible(true));
    }
}
