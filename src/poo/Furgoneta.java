package poo;

public class Furgoneta extends Coche {

    private int capacidadExtra;
    private int asientosExtra;

    public Furgoneta(int asientosExtra, int capacidadExtra) {

        super();
        this.asientosExtra = asientosExtra;
        this.capacidadExtra = capacidadExtra;

    }

    public String dimeDatosFurgoneta() {

        return "La capacidad de carga es: " + capacidadExtra + " y los asientos son: " + asientosExtra;
    }


}
