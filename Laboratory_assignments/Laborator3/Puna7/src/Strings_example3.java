import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Strings_example3 extends Canvas {
    public void paint(Graphics g) {
        int fontSize=(int)(10+Math.random()*63);
        int x=100,y=100;
        char[] letters ={'J','A','V','A'};
        Font f=new Font("Monospaced",Font.BOLD,fontSize);
        g.setColor(new Color((float) Math.random(),(float) Math.random(),(float) Math.random()));
        g.setFont(f);
        g.drawChars(letters,0,4,x,y);
        g.drawString("Hello World",20,200);
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame("Strings_example3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas=new Strings_example3();
        canvas.setSize(400,400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
}
