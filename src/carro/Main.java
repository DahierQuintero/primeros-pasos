package carro;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        Carro carro1 = new Carro();

        //Crear
        System.out.println("Elige la marca del vehiculo");
        carro1.setMarca(sc.nextLine());

        System.out.println("Elige cantidad de ruedas del vehiculo");
        carro1.setRuedas(Integer.parseInt(sc.nextLine()));

        System.out.println("Elige el color del vehiculo");
        carro1.setColor(sc.nextLine());

        System.out.println("Elige el peso del vehiculo");
        carro1.setPeso(sc.nextInt());

        //Leer
        System.out.println(carro1.setDatosGenerales());

        //Actualizar
        System.out.println("Cambia la marca del vehiculo");
        carro1.setMarca(sc2.nextLine());

        System.out.println("Cambia la cantidad de ruedas del vehiculo");
        carro1.setRuedas(Integer.parseInt(sc2.nextLine()));

        System.out.println("Cambia el color del vehiculo");
        carro1.setColor(sc2.nextLine());

        System.out.println("Cambia el peso del vehiculo");
        carro1.setPeso(sc2.nextInt());

        System.out.println(carro1.setDatosGenerales());

        //Eliminar
        carro1 = new Carro();

        System.out.println(carro1.setDatosGenerales());





    }
}
