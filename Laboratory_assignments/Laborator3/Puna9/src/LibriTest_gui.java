import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class LibriTest_gui extends JFrame {
    private final ArrayList<Libri> listaLibrave = new ArrayList<>();
    private final JTextArea textArea;
    private final JTextField isbnField;
    private final JTextField autoriField;
    private final JTextField titulliField;
    private final JTextField faqetField;
    private final JTextField llojiField;
    private final JTextField cmimiField;

    public LibriTest_gui() {
        setTitle("Menaxhimi i Librave");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2));

        panel.add(new JLabel("Autori:"));
        autoriField = new JTextField();
        panel.add(autoriField);

        panel.add(new JLabel("Titulli:"));
        titulliField = new JTextField();
        panel.add(titulliField);
        panel.add(new JLabel("ISBN:"));
        isbnField = new JTextField();
        panel.add(isbnField);
        panel.add(new JLabel("Numri i faqeve:"));
        faqetField = new JTextField();
        panel.add(faqetField);
        panel.add(new JLabel("Lloji:"));
        llojiField = new JTextField();
        panel.add(llojiField);
        panel.add(new JLabel("Çmimi:"));
        cmimiField = new JTextField();
        panel.add(cmimiField);
        add(panel, BorderLayout.NORTH);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton btnShfaq = new JButton("Shfaq Librat");
        btnShfaq.addActionListener(e -> shfaqLibrat());
        buttonPanel.add(btnShfaq);

        JButton btnShto = new JButton("Shto Libër");
        btnShto.addActionListener(e -> shtoLiber());
        buttonPanel.add(btnShto);

        JButton btnKerko = new JButton("Kërko Libër");
        btnKerko.addActionListener(e -> kerkoLiber());
        buttonPanel.add(btnKerko);

        JButton btnHiq = new JButton("Hiq Libër");
        btnHiq.addActionListener(e -> hiqLiber());
        buttonPanel.add(btnHiq);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void shtoLiber() {
        String autori = autoriField.getText();
        String titulli = titulliField.getText();
        String isbn = isbnField.getText();
        int faqet = Integer.parseInt(faqetField.getText());
        String lloji = llojiField.getText();
        double cmimi = Double.parseDouble(cmimiField.getText());

        Libri libri = new Libri(autori, titulli, isbn, faqet, lloji, cmimi);
        listaLibrave.add(libri);
        JOptionPane.showMessageDialog(this, "Libri u shtua me sukses.");
    }

    private void kerkoLiber() {
        String isbn = JOptionPane.showInputDialog("Jep ISBN për të kërkuar një libër:");
        boolean gjetur = false;
        for (Libri libri : listaLibrave) {
            if (libri.getIsbn().equals(isbn)) {
                textArea.setText(libri.toString());
                gjetur = true;
                break;
            }
        }
        if (!gjetur) {
            textArea.setText("Libri me ISBN " + isbn + " nuk u gjet.");
        }
    }

    private void shfaqLibrat() {
        if (listaLibrave.isEmpty()) {
            textArea.setText("Nuk ka libra në listë.");
        } else {
            StringBuilder sb = new StringBuilder();
            for (Libri libri : listaLibrave) {
                sb.append(libri.toString()).append("\n");
            }
            textArea.setText(sb.toString());
        }
    }

    private void hiqLiber() {
        String isbn = JOptionPane.showInputDialog("Jep ISBN për të hequr një libër:");

        boolean hoq = listaLibrave.removeIf(libri -> libri.getIsbn().equals(isbn));
        if (hoq) {
            JOptionPane.showMessageDialog(this, "Libri u hoq me sukses.");
        } else {
            JOptionPane.showMessageDialog(this, "Libri me ISBN " + isbn + " nuk u gjet.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LibriTest_gui frame = new LibriTest_gui();
            frame.setVisible(true);
        });
    }
}

