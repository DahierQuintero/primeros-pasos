package biblioteca;

public class Catálogo extends Escrito {

    private double precio;
    private String menú;

    public void setPrecio (double precio) {
        this.precio = precio;
    }

    public void setMenú (String menú) {
        this.menú = menú;
    }

    public Catálogo(String categoria, Character inicial, int año) {
        super(categoria, inicial, año);
    }
}
