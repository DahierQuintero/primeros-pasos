import java.util.*;
public class Adivina_Número {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int aleatorio = (int)(Math.random()*100);

        int número = 0;

        int intentos = 0;

        do{
            intentos++;

            System.out.println("Ingresa un número");

            número = entrada.nextInt();

            if (aleatorio<número){

                System.out.println("Pista: el número es menor");
            }

            else if (aleatorio>número) {

                System.out.println("Pista: el número es mayor");
            }

        }while (número != aleatorio);
        System.out.println("Es correcto. Lo lograste en " + intentos + " intentos");
    }
}
