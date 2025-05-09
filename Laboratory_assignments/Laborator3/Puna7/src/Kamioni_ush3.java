// Ushtrimi 3) vizatoni nje kamion dhe te jete ne levizje
import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kamioni_ush3 extends Canvas implements ActionListener {
    private int truckX = 0;
    private int speed = 5;
    private int canvasWidth = 400;
    private Timer timer;
    public Kamioni_ush3() {
        timer = new Timer(50, this);
        timer.start();
    }

    public void paint(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillRect(truckX, 55, 300, 150);
        g.setColor(Color.BLACK);
        g.fillOval(truckX + 50, 190, 60, 60);
        g.fillOval(truckX + 200, 190, 60, 60);
        g.setColor(Color.YELLOW);
        g.fillRect(truckX + 220, 90, 80, 50);
    }

    public void actionPerformed(ActionEvent e) {
        truckX += speed;
        if (truckX > canvasWidth) {
            truckX = -300;
        }
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Kamioni_ush3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Kamioni_ush3 canvas = new Kamioni_ush3();
        canvas.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
}