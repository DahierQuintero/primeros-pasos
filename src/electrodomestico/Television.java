package electrodomestico;

public class Television extends Electrodomestico{

    //Constantes
    private final double resolucionDef = 20;
    private final boolean sintonizadorTDTDef = false;

    //Atributos
    private double resolucion;
    private boolean sintonizadorTDT;

    //Constructores
    public Television() {
        super(precioBaseDef, colorDef, consumoEnergeticoDef, pesoDef);
        resolucion = resolucionDef;
        sintonizadorTDT = sintonizadorTDTDef;
    }
    public Television(double precio, double peso) {
        super(precio, colorDef,consumoEnergeticoDef,peso);
        resolucion = resolucionDef;
        sintonizadorTDT = sintonizadorTDTDef;
    }
    public Television(double resolucion, boolean sintonizadorTDT) {
        super(precioBaseDef, colorDef, consumoEnergeticoDef, pesoDef);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    //Metodos
    public double getResolucion() {
        return resolucion;
    }
    public boolean getsintonizadorTDT() {
        return sintonizadorTDT;
    }
    public double precioFinal() {
        double plus = super.precioFinal();
        if (resolucion > 40) {
            plus += precioBase * 0.3;
        }
        if (sintonizadorTDT){
            plus += 50;
        }
        return plus;
    }
}
