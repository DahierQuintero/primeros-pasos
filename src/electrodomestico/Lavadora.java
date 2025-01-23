package electrodomestico;

public class Lavadora extends Electrodomestico{

    //Constantes
    private final double cargaDef = 5;

    //Atributos
    private double carga;

    //Constructores
    public Lavadora () {
        super();
    }
    public Lavadora (double precioBase, double peso) {
        super(precioBase, colorDef, consumoEnergeticoDef, peso);
    }
    public Lavadora (double carga) {
        super(precioBaseDef, colorDef, consumoEnergeticoDef, pesoDef);
        this.carga = carga;
    }

    //Metodos
    public double getCarga() {
        return carga;
    }
    public double precioFinal() {
        double plus = super.precioFinal();
        if (carga > 30) {
            plus += 50;
        }
        return plus;
    }
}
