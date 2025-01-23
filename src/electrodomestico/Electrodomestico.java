package electrodomestico;

public class Electrodomestico {
    //Constantes
    protected final static double precioBaseDef = 100;
    protected final static String colorDef = "Blanco";
    protected final static char consumoEnergeticoDef = 'F';

    protected final static double pesoDef = 5;

    //Atributos
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    //Constructores
    public Electrodomestico () {
        this(precioBaseDef,colorDef, consumoEnergeticoDef, pesoDef);
    }

    public Electrodomestico (double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        color = colorDef;
        consumoEnergetico = consumoEnergeticoDef;
    }

    public Electrodomestico (double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void comprobarConsumoEnergetico (char consumoEnergetico) {
        int aMayus = 65;
        int fMayus = 70;
        if (consumoEnergetico >= aMayus && consumoEnergetico <= fMayus) {
            this.consumoEnergetico = consumoEnergetico;
        }
        else {
            this.consumoEnergetico = consumoEnergeticoDef;
        }
    }

    public void comprobarColor (String color) {

        String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado = false;

        for (int i = 0; i < colores.length && !encontrado; i++) {
            if (colores[i].equalsIgnoreCase(color)) {
                encontrado = true;
            }
        }
        if (encontrado) {
            this.color = color;
        }
        else {
            this.color = colorDef;
        }
    }
    public double precioFinal() {
        double plus = 0;
        switch (consumoEnergetico){
            case 'A':
                plus += 100;
                break;
            case 'B':
                plus += 80;
                break;
            case 'C':
                plus += 60;
                break;
            case 'D':
                plus += 50;
                break;
            case 'E':
                plus += 30;
                break;
            case 'F':
                plus += 10;
                break;
        }
        if (peso >= 0 && peso <= 19) {
            plus += 10;
        }
        else if (peso >= 20 && peso <= 49) {
            plus += 50;
        }
        else if (peso >= 50 && peso <= 79) {
            plus += 80;
        }
        else if (peso >= 80) {
            plus += 100;
        }
        return precioBase + plus;
    }


}
