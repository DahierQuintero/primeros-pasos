import javax.swing.*;
import java.util.*;
public class Áreas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Elige una opción para hallar el área: \n1)Cuadrado \n2)Rectángulo \n3)Triángulo \n4)Círculo");

        int figura = entrada.nextInt();

        switch (figura){

            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado"));

                System.out.println("El área del Cuadrado es: " + Math.pow(lado,2) + " metros");
                break;

            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));

                int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura"));

                System.out.println("El área del Rectángulo es: " + base*altura + " metros");
                break;

            case 3:
                base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));

                altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura"));

                System.out.println("El área del Triángulo es: " + (base*altura)/2 + " metros");
                break;

            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio"));

                System.out.print("El área del Círculo es: ");
                System.out.printf("%1.2f",Math.PI*(Math.pow(radio,2)));
                System.out.println(" metros");
                break;

            default:
                System.out.println("La opción no existe");
        }
    }
}
