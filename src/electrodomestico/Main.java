package electrodomestico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        electrodomesticos[0] = new Lavadora(20);
        electrodomesticos[1] = new Lavadora(45,60);
        electrodomesticos[2] = new Lavadora(32 );
        electrodomesticos[3] = new Television(60,15);
        electrodomesticos[4] = new Television(45,true);
        electrodomesticos[5] = new Television();
        electrodomesticos[6] = new Electrodomestico();
        electrodomesticos[7] = new Electrodomestico(46,40);
        electrodomesticos[8] = new Electrodomestico(80,"Azul",'A',35);
        electrodomesticos[9] = new Electrodomestico(80,10);

        double sumaLavadoras = 0;
        double sumaTelevisores = 0;
        double sumaElectrodomesticos = 0;

        for (Electrodomestico i : electrodomesticos) {

            if (i instanceof Lavadora) {
                sumaLavadoras += i.precioFinal();
            }
            if (i instanceof Television) {
                sumaTelevisores += i.precioFinal();
            }
            sumaElectrodomesticos += i.precioFinal();
        }
        System.out.println(sumaLavadoras + " para Lavadoras, " + sumaTelevisores + " para Televisores y" +
                sumaElectrodomesticos + " para Electrodomesticos");

    }
}
