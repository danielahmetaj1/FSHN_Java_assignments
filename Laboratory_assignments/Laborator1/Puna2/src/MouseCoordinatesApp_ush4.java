import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseCoordinatesApp_ush4 {
    public static void main(String[] args) {
        new MouseFrame();
    }
}
class MouseFrame extends JFrame {
    private JTextField xField;
    private JTextField yField;
    public MouseFrame() {
        setTitle("Mouse Coordinates");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 2));
        add(new JLabel("X: "));
        xField = new JTextField();
        xField.setEditable(false);
        add(xField);
        add(new JLabel("Y: "));
        yField = new JTextField();
        yField.setEditable(false);
        add(yField);
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                xField.setText(String.valueOf(e.getX()));
                yField.setText(String.valueOf(e.getY()));
            }
        });
        setVisible(true);
    }
}