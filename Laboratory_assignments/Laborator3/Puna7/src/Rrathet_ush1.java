//(Ushtrimi 1) Shkruani nje program qe realizon vizatimin e disa rratheve bashkeqendrore si ne figure:

import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Graphics;

public class Rrathet_ush1 extends Canvas {
    public void paint(Graphics g) {
        int a=200,b=200,x=30;
        for (int i=1;i<=10;i++){
            g.drawOval(a,b,x,x);
            a=a-20;
            b=b-20;
            x=x+40;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rrathet_ush1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Rrathet_ush1();
        canvas.setSize(500,500);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

}
