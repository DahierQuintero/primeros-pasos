package balon;

public class Adidas extends Balon{

    private String terreno;

    public void setTerreno (String terreno) {
        this.terreno = terreno;
    }

    public Adidas(String marca, int peso, String color, String ocupacion, String terreno) {
        super(marca, peso, color, ocupacion);
        this.terreno = terreno;
    }
}
