/*4. Merrni nga përdoruesi përmasat e një drejtkëndëshi. Afishoni sipërfaqen dhe perimetrin
e tij. Kontrolloni nëse gjatësia është ose jo vlerë numerike.*/


import javax.swing.JOptionPane;

public class Ush4 {
    public static void main(String[] args) {
        try {
            String str1=JOptionPane.showInputDialog(null,"Jepni gjatesine: ","Input",JOptionPane.INFORMATION_MESSAGE);
            double gjatesia=Double.parseDouble(str1);
            String str2=JOptionPane.showInputDialog(null,"Jepni gjeresine: ","Input",JOptionPane.INFORMATION_MESSAGE);
            double gjeresia=Double.parseDouble(str2);
            double siperfaqja=gjatesia*gjatesia;
            double perimetri=2*gjatesia+2*gjeresia;

            JOptionPane.showMessageDialog(null,"perimetri: "+perimetri+"\nSiperfaqja: "+siperfaqja,"Drejtkendeshi",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
