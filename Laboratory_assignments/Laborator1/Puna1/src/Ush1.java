/*1. Krijoni një dritare që afishon në ekran një mesazh përshëndetjeje.
JOptionPane – Klasa
Metodat:
showMessageDialog(parent, message)
showConfirmDialog(parent, message)
showInputDialog(parent, message)*/

import javax.swing.JOptionPane;

public class Ush1{
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello World",
                "Mesazh pershendetjeje", JOptionPane.INFORMATION_MESSAGE);
    }
}