import javax.swing.*;

public class Entrada_Ejemplo2 {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Ingresa tu nombrecillo");

        String edad_usuario = JOptionPane.showInputDialog("Ingresa tu edad");

        int edad = Integer.parseInt(edad_usuario);

        edad++;

        System.out.println("Hola " + nombre + ". El año que viene tendrás " +
                edad + " años.");

    }
}
