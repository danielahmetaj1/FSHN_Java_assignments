import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JColorChoser_example4 extends JFrame implements ActionListener {
    JButton b;
    Container c;
    JColorChoser_example4(){
        c=getContentPane();
        c.setLayout(new FlowLayout());
        b=new JButton("Color");
        b.addActionListener(this);
        c.add(b);
    }
    public void actionPerformed(ActionEvent e){
        Color ngjyraFill=Color.RED;
        Color ngjyra= JColorChooser.showDialog(this, "Choose Color", ngjyraFill);
        c.setBackground(ngjyra);
    }

    public static void main(String[] args) {
        JColorChoser_example4 ch=new JColorChoser_example4();
        ch.setSize(400,400);
        ch.setVisible(true);
        ch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
