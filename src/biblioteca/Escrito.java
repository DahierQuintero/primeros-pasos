package biblioteca;

public class Escrito {

    private String categoria;
    private Character inicial;
    private int año;

    public Escrito (String categoria, Character inicial, int año) {
        this.categoria = categoria;
        this.inicial = inicial;
        this.año = año;
    }
     public String getCategoria () {
        return categoria;
     }
     public Character getInicial () {
        return inicial;
     }
     public int getAño () {
        return año;
     }
}
