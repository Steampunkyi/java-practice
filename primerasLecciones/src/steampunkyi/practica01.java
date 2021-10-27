package steampunkyi;

import javax.swing.JOptionPane;

public class practica01 {
    public static void main(String[] args) {
        String dato = JOptionPane.showInputDialog(null, "Dame un numero positivo: ");
        int numUno = Integer.parseInt(dato);
        String par = "";
        if (numUno % 2 == 0) {
            par = par + "El numero " + numUno + " es par";
        } else {
            par = par + "El numero " + numUno + " es impar";
        }
        JOptionPane.showMessageDialog(null, par, "Que numero es?", JOptionPane.INFORMATION_MESSAGE);
    }
}
