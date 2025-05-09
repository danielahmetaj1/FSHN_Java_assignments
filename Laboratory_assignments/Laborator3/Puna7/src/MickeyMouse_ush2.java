import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class MickeyMouse_ush2 extends Canvas {
    public void paint(Graphics g) {
        // Draw Mickey's head and ears
        g.setColor(Color.RED);
        g.fillOval(100, 100, 200, 200);
        g.setColor(Color.RED);
        g.fillOval(50,50 , 100, 100);
        g.setColor(Color.RED);
        g.fillOval(250,50 , 100, 100);

        // Draw Mickey's eyes
        g.setColor(Color.WHITE);
        g.fillOval(150, 160, 30, 40);
        g.fillOval(220, 160, 30, 40);

        g.setColor(Color.BLACK);
        g.fillOval(160, 175, 10, 15);
        g.fillOval(230, 175, 10, 15);

        // Draw Mickey's smile
        g.setColor(Color.BLACK);
        g.drawArc(160, 200, 80, 50, 180, 180);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MickeyMouse_ush2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new MickeyMouse_ush2();
        canvas.setSize(400, 400);
        frame.add(canvas);

        frame.pack();
        frame.setVisible(true);
    }
}
