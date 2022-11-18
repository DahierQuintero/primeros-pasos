import javax.swing.*;

public class Entrada_Números {
    public static void main(String[] args) {

        String num1 = JOptionPane.showInputDialog("Ingresa un número");

        double num2 = Double.parseDouble(num1);

        System.out.print("La raíz de "+ num2 + " es:");

        System.out.printf("%2.2f",Math.sqrt(num2));

    }
}
