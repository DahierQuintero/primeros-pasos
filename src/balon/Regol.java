package balon;

public class Regol extends Balon{

    private String textura;

    public void setTextura (String textura) {
        this.textura = textura;
    }

    public Regol(String marca, int peso, String color, String ocupacion) {
        super(marca, peso, color, ocupacion);
    }
}
