import java.util.*;
public class Evalua_Edad {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");

        String nombre = entrada.nextLine();

        System.out.println("Ingresa tu edad");

        int edad = entrada.nextInt();

        if (edad<18){
            System.out.println("Hola pequeño " + nombre + " es hora de ir a dormir");
        }
        else if (edad<=30) {
            System.out.println("Ponte juicioso " + nombre
            + " adelante");
        }
        else if (edad<=80) {
            System.out.println("Este lugar no es indicado para ti " + nombre);
        }
        else{
            System.out.println("Aquí no fabricamos lápidas " + nombre);
        }
    }

}
