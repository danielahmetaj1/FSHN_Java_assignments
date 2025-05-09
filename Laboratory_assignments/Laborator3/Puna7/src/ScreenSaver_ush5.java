import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ScreenSaver_ush5 extends JPanel {

    private final Random random = new Random();
    private int lineCount = 0;
    private static final int MAX_LINES = 100;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        g.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));

        int x1 = random.nextInt(getWidth());
        int y1 = random.nextInt(getHeight());
        int x2 = random.nextInt(getWidth());
        int y2 = random.nextInt(getHeight());
        g.drawLine(x1, y1, x2, y2);
        lineCount++;
        if (lineCount >= MAX_LINES) {
            lineCount = 0;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
        } else {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Screen Saver Simulues");
        ScreenSaver_ush5 screensaver = new ScreenSaver_ush5();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screensaver.setSize(1200, 800);
        frame.add(screensaver);
        frame.pack();
        frame.setVisible(true);
    }
}
