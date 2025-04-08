/*5. Krijoni një frame me emrin: Frame ynë i parë
përmasat 300x120
location (100,50)*/

import javax.swing.JFrame;

public class Ush5 {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,120);
        frame.setLocation(100,50);
        frame.setVisible(true);
    }
}
