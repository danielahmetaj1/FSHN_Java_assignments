import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Graphics;

public class Rreth_example1 extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("vizatimi i pare");
        Canvas canvas = new Rreth_example1();
        canvas.setSize(400,400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
    public void paint(Graphics g) {
        g.fillOval(100,100,200,200);
    }

}
