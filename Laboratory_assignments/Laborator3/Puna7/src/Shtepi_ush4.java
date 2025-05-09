import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Shtepi_ush4 extends Canvas {
    public void paint(Graphics g){
        // qielli
        g.setColor(new Color(135, 206, 235));
        g.fillRect(0, 0, 1200, 500);
        
        // dielli
        g.setColor(new Color(255, 215, 0));
        g.fillOval(100, 80, 100, 100);
        g.drawLine(100, 130, 60, 130);
        g.drawLine(200, 130, 240, 130);
        g.drawLine(150, 80, 150, 40);
        g.drawLine(150, 180, 150, 220);
        g.drawLine(115, 95, 85, 65);
        g.drawLine(185, 95, 215, 65);
        g.drawLine(115, 165, 85, 195);
        g.drawLine(185, 165, 215, 195);
        
        // oborri
        g.setColor(new Color(34, 139, 34));
        g.fillRect(0, 500, 1200, 300);

        //muri
        g.setColor(new Color(249, 219, 186));
        g.fillRect(400, 250, 600, 400);
        //dera
        g.setColor(Color.GRAY);
        g.fillRect(650, 450, 100, 200);
        //doreza
        g.setColor(Color.BLACK);
        g.fillOval(730, 550, 20, 20);
        //dritare
        g.setColor(new Color(203, 241, 245));
        g.fillRect(450, 380, 150, 150);
        g.fillRect(800, 380, 150, 150);
        //pjeset e dritares
        g.setColor(Color.BLACK);
        g.drawLine(450, 455, 600, 455);
        g.drawLine(800, 455, 950, 455);
        g.drawLine(525,380,525,530);
        g.drawLine(875,380,875,530);
        
        // catia
        g.setColor(new Color(190, 91, 80));
        g.fillPolygon(new int[]{350, 700, 1050}, new int[]{250, 50, 250}, 3);
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame("Shtepi_ush4");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Shtepi_ush4 canvas=new Shtepi_ush4();
        canvas.setSize(1200,800);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
}