import java.util.Scanner;

public class Ejercicio_JP {
    public static void main(String[] args) {

        //Programa que permita ingresar una frase y una letra, y que cuente cuantas veces está la letra
        //la vaca lola
        //a
        System.out.println("Ingrese una frase");

        Scanner entrada = new Scanner(System.in);

        String frase = entrada.nextLine();

        int contador = 0;

        System.out.println("Ingrese una letra");

        String letra = entrada.next();

        for(int i = 0; i < frase.length(); i++){
            if (letra.equalsIgnoreCase(String.valueOf(frase.charAt(i)))){
                contador++;
            }
        }

        System.out.println("La letra esta " + contador + " veces");

    }
}
