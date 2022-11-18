package persona;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Persona persona1 = new Persona(sc.nextLine(),sc.nextInt(), sc.next().charAt(0), sc.nextDouble(), sc.nextDouble());
        System.out.println(persona1.calcularIMC());
        System.out.println(persona1.esMayorDeEdad());
        System.out.println(persona1.toString());

        sc = new Scanner(System.in);
        Persona persona2 = new Persona(sc.nextLine(),sc.nextInt(), sc.next().charAt(0));
        System.out.println(persona2.calcularIMC());
        System.out.println(persona2.esMayorDeEdad());
        System.out.println(persona2.toString());

        sc = new Scanner(System.in);
        Persona persona3 = new Persona();
        persona3.setNombre(sc.nextLine());
        persona3.setEdad(sc.nextInt());
        persona3.setSexo(sc.next().charAt(0));
        persona3.setPeso(sc.nextDouble());
        persona3.setAltura(sc.nextDouble());

        System.out.println(persona3.calcularIMC());
        System.out.println(persona3.esMayorDeEdad());
        System.out.println(persona3.toString());

    }
}
