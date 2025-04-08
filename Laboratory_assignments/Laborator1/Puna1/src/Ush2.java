/*2. Krijoni një program që përfshin 3 metodat e mësipërme të JOptionPane.*/


import javax.swing.JOptionPane;

public class Ush2 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello World", "Mesazh pershendetjeje", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showConfirmDialog(null,"Confirm message","confirm",JOptionPane.YES_NO_CANCEL_OPTION);
        JOptionPane.showInputDialog(null,"Jepni nje input","Input",JOptionPane.QUESTION_MESSAGE);
    }
}
