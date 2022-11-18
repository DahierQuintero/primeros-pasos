import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.println("Ingrese el primer número");
        num1 = entrada.nextInt();

        System.out.println("Ingrese el segundo número");
        num2 = entrada.nextInt();

        System.out.println("Ingrese el tercer número");
        num3 = entrada.nextInt();

        if (num1 > num2 & num1 > num3) {

            if (num2 > num3) {

                System.out.println("El número mayor es " + num1 + " y el menor es " + num3);
            }
            else if (num3 > num2){

                System.out.println("El número mayor es " + num1 + " y el menor es " + num2);
            }
            else {

                System.out.println("El número mayor es " + num1 + " y los otros son iguales");
            }

        }
        else if (num2 > num1 & num2 > num3) {

            if (num1 > num3) {

                System.out.println("El número mayor es " + num2 + " y el menor es " + num3);
            }
            else if (num3 > num1) {

                System.out.println("El número mayor es " + num2 + " y el menor es " + num1);
            }
            else {

                System.out.println("El número mayor es " + num2 + " y los otros son iguales");
            }

        }
        else if (num3 > num2 & num3 > num1) {

            if (num2 > num1) {

                System.out.println("El número mayor es " + num3 + " y el menor es " + num1);
            }
            else if (num1 > num2) {

                System.out.println("El número mayor es " + num3 + " y el menor es " + num2);
            }
            else {

                System.out.println("El número mayor es " + num3 + " y los otros son iguales");
            }

        }
        else {

            System.out.println("Los números son iguales");
        }

    }
}
