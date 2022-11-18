import java.util.Scanner;

public class RecArray {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String texto;
        char letra;
        int contador=0;

        System.out.println("Introduce un texto");

        texto = entrada.nextLine();

        System.out.println("Introduce una letra");

        letra = entrada.next().charAt(0);

        for (int i = 0; i < texto.length(); i++){

            if (texto.charAt(i) == letra){

                contador++;
            }

        }

        System.out.println("La letra " + letra + " esta " + contador + " veces en el texto");
    }
}
