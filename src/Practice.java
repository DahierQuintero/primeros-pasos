import java.util.*;

public class Practice {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingresa tu edad");
        int edad = entrada.nextInt();
        System.out.println("Ingresa una frase");
        Scanner entrada2 = new Scanner(System.in);
        String frase = entrada2.nextLine();


        System.out.println("Tu nombre es " + nombre + " tienes " + edad + " años y tu frase es: " +
                frase);

        //Operación matemática

        System.out.println("Ingrese el primer número");
        double num1 = entrada2.nextDouble();
        System.out.println("Ingrese el segundo número");
        double num2 = entrada2.nextDouble();
        double resultado = num1 * num2;

        System.out.println(" El resultado de su multiplicación es " + resultado + " y la raíz es " +
                Math.sqrt(resultado));

        //Conversor

        Scanner entrada3 = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre1 = entrada3.nextLine();
        System.out.println("Ingresa tu edad");
        String edad_usuario = entrada3.next();
        int edad1 = Integer.parseInt(edad_usuario);

        System.out.println("Hola " + nombre1 + " tu edad actual es " + edad1 +
                " años, el próximo año tendrás " + (edad1+1) + " años");

        //Identificar número par e impar

        Scanner entrada4 = new Scanner(System.in);

        System.out.println("Ingrese el número a evaluar");

        int número = entrada4.nextInt();

        if (número % 2 == 0){

            System.out.println( número + " es un número par");
        }
        else{

            System.out.println( número + " es un número impar");
        }

    }
}
