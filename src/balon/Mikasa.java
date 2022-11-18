package balon;

public class Mikasa extends Balon{

    private String tipoZapato;

    public void setTipoZapato (String tipoZapato) {
        this.tipoZapato = tipoZapato;
    }

    public Mikasa(String marca, int peso, String color, String ocupacion, String tipoZapato) {
        super(marca, peso, color, ocupacion);
        this.tipoZapato = tipoZapato;
    }
}
