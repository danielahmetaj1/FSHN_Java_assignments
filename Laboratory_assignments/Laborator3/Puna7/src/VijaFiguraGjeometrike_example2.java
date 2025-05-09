import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class VijaFiguraGjeometrike_example2 extends Canvas {
    public void paint(Graphics g) {
        this.setBackground(Color.WHITE);
        g.setColor(Color.RED);
        g.drawLine(4,30,380,30);
        g.setColor(Color.BLUE);
        g.drawRect(5,40,90,55);
        g.fillRect(5,40,90,55);
        g.setColor(Color.CYAN);
        g.fillRoundRect(195,40,90,55,50,50);
        g.drawRoundRect(290,40,90,55,20,20);
        g.setColor(Color.GREEN);
        g.draw3DRect(100,100,90,55,false);
        g.setColor(Color.MAGENTA);
        g.drawOval(195,100,90,55);
        g.fillOval(290,100,90,55);


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Figura Gjeometrike");
        Canvas canvas = new VijaFiguraGjeometrike_example2();
        canvas.setSize(400,400);
        frame.add(canvas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
