/*3. Merrni nga përdoruesi moshën dhe gjatësinë në m dhe afishoni vlerat e marra me
mesazh. (gjatësinë e afishoni në cm). Kontrolloni nëse gjatësia është ose jo vlerë
numerike.*/


import javax.swing.JOptionPane;

public class Ush3 {
    public static void main(String[] args) {
        try {
            String str1=JOptionPane.showInputDialog(null,"Jepni Moshen: ","Input",JOptionPane.QUESTION_MESSAGE);
            int mosha=Integer.parseInt(str1);
            String str2=JOptionPane.showInputDialog(null,"Jepni gjatesine ne metra: ","Input",JOptionPane.QUESTION_MESSAGE);
            double gjatesia=Double.parseDouble(str2) * 100;
            JOptionPane.showMessageDialog(null,"Mosha: "+mosha+" vjec\n"+"Gjatesia: "+gjatesia+" cm","Mosha dhe gjatesia",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
