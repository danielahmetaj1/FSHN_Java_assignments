//2. Krijoni një frame që përmban një JTable si në figurë:

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class StudentTable_ush2 extends JFrame {
    public StudentTable_ush2() {
        setTitle("JTable");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        String[] columnNames = {"ID Studenti", "Emri", "Mbiemri"};
        Object[][] data = {
                {"1", "Daniel", "Ahmetaj"},
                {"2", "Emer2", "Mbiemer2"},
                {"3", "Emer3", "Mbiemer3"}
        };

        JTable table = new JTable(new DefaultTableModel(data, columnNames));
        JScrollPane scrollPane = new JScrollPane(table);

        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentTable_ush2();
    }
}
