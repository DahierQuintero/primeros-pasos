import java.util.*;

public class Entrada_Ejemplo1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Buenos días, por favor ingrese su nombre");

        String nombre = entrada.nextLine();

        System.out.println("Por favor ingrese su edad");

        int edad = entrada.nextInt();

        System.out.println("Hola " + nombre + ". El próximo año tendrás " +
                (edad + 1) + " años.");


    }

}
