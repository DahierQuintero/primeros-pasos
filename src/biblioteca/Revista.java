package biblioteca;

public class Revista extends Escrito{

    private int paginas;
    private String indice;

    public void setIndice (String indice) {
        this.indice = indice;
    }

    public void setPaginas (int paginas) {
        this.paginas = paginas;
    }

    public Revista(String categoria, Character inicial, int año) {
        super(categoria, inicial, año);
    }
}
