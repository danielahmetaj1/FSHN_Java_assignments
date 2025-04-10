/*1. Krijoni një frame që përmban një input tekst, një buton, dhe një JList. Në klik të butonit
Shto, në JList do të shtohet teksti i vendosur. Frame përmban edhe një buton Pastro.*/
import javax.swing.*;

public class ListaEmrave_ush1 extends JFrame {

    private final JTextField inputField;
    private final DefaultListModel<String> listModel;

    public ListaEmrave_ush1() {
        setTitle("JList");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 450);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        inputField = new JTextField(15);
        JButton shtoButton = new JButton("Shto");
        JButton pastroButton = new JButton("Pastro");
        listModel = new DefaultListModel<>();
        JList<String> emratList = new JList<>(listModel);
        JScrollPane scroll1=new JScrollPane(emratList);
        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Vendosni emrin"));
        topPanel.add(inputField);
        topPanel.add(shtoButton);

        scroll1.setBounds(20,70,350,250);
        topPanel.setBounds(20,20,350,50);
        pastroButton.setBounds(260,350,100,20);
        add(topPanel);
        add(scroll1);
        add(pastroButton);

        shtoButton.addActionListener(_ -> {
            String emri = inputField.getText().trim();
            if (!emri.isEmpty()) {
                listModel.addElement(emri);
                inputField.setText("");
            }
        });

        pastroButton.addActionListener(_ -> listModel.clear());
        setVisible(true);
    }

    public static void main(String[] args) {
        new ListaEmrave_ush1();
    }
}
