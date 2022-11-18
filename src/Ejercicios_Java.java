import java.util.Scanner;

public class Ejercicios_Java {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String frase;

        System.out.println("Ingresa una frase");

        frase = entrada.nextLine();

        System.out.println(frase);

        for (int i = frase.length() - 1; i>=0; i--) {

            System.out.print(frase.charAt(i));

        }
    }
}
