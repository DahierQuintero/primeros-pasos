package biblioteca;

public class Libro extends Escrito{

    private String indice;
    private int paginas;

    public void setIndice(String indice) {
        this.indice = indice;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Libro(String categoria, Character inicial, int año, String indice, int paginas) {
        super(categoria, inicial, año);
        this.indice = indice;
        this.paginas = paginas;
    }
}
