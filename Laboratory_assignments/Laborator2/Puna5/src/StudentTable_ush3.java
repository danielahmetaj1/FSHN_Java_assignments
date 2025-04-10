/*3. Duke përdorur JTable të ushtrimit 2, bëni të mundur që në klikim të një prej
qelizave nëpërmjet JOptionPane, të afishoni vlerën e marrë nga qeliza.*/

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StudentTable_ush3 extends JFrame {
    public StudentTable_ush3() {
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

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = table.getSelectedRow();
                int col = table.getSelectedColumn();
                if (row != -1 && col != -1) {
                    Object value = table.getValueAt(row, col);
                    JOptionPane.showMessageDialog(null, "Vlera e zgjedhur: " + value);
                }
            }
        });

        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentTable_ush3();
    }
}
