package poo;

public class Uso_Vehiculo {

    public static void main(String[] args) {

        Coche miCoche1 = new Coche();
        miCoche1.estableceColor("Rojo");
        Furgoneta miFurgoneta1 = new Furgoneta(4,580);
        miFurgoneta1.estableceColor("Azul");
        miFurgoneta1.configuraAsientos("si");
        miFurgoneta1.configuraClimatizador("Si");

        System.out.println(miCoche1.dimeDatosGenerales() + " " + miCoche1.dimeColor());
        System.out.println(miFurgoneta1.dimeDatosGenerales() + " " + miFurgoneta1.dimeDatosFurgoneta());

    }
}
