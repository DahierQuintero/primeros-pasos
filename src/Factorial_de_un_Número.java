import javax.swing.*;

public class Factorial_de_un_Número {
    public static void main(String[] args) {

        int resultado = 1;

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));

        for(int i=numero; i>0; i--){

            resultado = resultado*i;
        }

        System.out.println("El factorial de " + numero + " es " + resultado);
    }
}
