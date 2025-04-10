import javax.swing.*;
import java.awt.*;
import java.util.*;

public class KlasaStudentFrame extends JFrame {
    private DefaultListModel<Student> modelLista;
    private JList<Student> listaStudenteve;
    private java.util.List<Student> studentet;

    public KlasaStudentFrame() {
        super("Klasa Student");
        studentet = new ArrayList<>();
        modelLista = new DefaultListModel<>();
        listaStudenteve = new JList<>(modelLista);

        JButton shtoButton = new JButton("Shtoni nje student te ri");
        JButton kerkoButton = new JButton("Kerkoni nje student");
        JButton renditButton = new JButton("Rendisni studentet");

        shtoButton.addActionListener(e -> shtoStudent());
        kerkoButton.addActionListener(e -> kerkoStudent());
        renditButton.addActionListener(e -> renditStudentet());

        JPanel panel = new JPanel();
        panel.add(shtoButton);
        panel.add(kerkoButton);
        panel.add(renditButton);

        setLayout(new BorderLayout());
        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(listaStudenteve), BorderLayout.CENTER);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
    }

    private void shtoStudent() {
        String emri = JOptionPane.showInputDialog(this, "Jepni nje emer studenti:");
        if (emri != null && !emri.trim().isEmpty()) {
            Student s = new Student(emri.trim());
            studentet.add(s);
            modelLista.addElement(s);
        }
    }

    private void kerkoStudent() {
        String emri = JOptionPane.showInputDialog(this, "Kerkoni me emer studenti:");
        if (emri != null && !emri.trim().isEmpty()) {
            boolean gjetur = false;
            for (Student s : studentet) {
                if (s.getEmri().equalsIgnoreCase(emri.trim())) {
                    JOptionPane.showMessageDialog(this, "Studenti u gjet: " + s.getEmri());
                    gjetur = true;
                    break;
                }
            }
            if (!gjetur) {
                JOptionPane.showMessageDialog(this, "Studenti nuk u gjet.");
            }
        }
    }

    private void renditStudentet() {
        studentet.sort(Comparator.comparing(Student::getEmri));
        modelLista.clear();
        for (Student s : studentet) {
            modelLista.addElement(s);
        }
    }

    public static void main(String[] args) {
        new KlasaStudentFrame();
    }
}
