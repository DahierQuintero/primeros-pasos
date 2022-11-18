package balon;

public class Balon{

    private String marca;
    private int peso;
    private String color;
    private String ocupacion;

    public Balon (String marca, int peso, String color, String ocupacion) {
        this.marca = marca;
        this.peso = peso;
        this.color = color;
        this.ocupacion = ocupacion;
    }

    public String getMarca () {
        return marca;
    }

    public int getPeso () {
        return peso;
    }

    public String getColor () {
        return color;
    }

    public String getOcupacion () {
        return ocupacion;
    }
}
