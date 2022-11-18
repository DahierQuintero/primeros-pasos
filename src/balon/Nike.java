package balon;

public class Nike extends Balon{

    private int tamanho;

    public void setTamanho (int tamanho) {
        this.tamanho = tamanho;
    }

    public Nike(String marca, int peso, String color, String ocupacion, int tamanho) {
        super(marca, peso, color, ocupacion);
        this.tamanho = tamanho;
    }


}
