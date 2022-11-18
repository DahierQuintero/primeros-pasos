package biblioteca;

public class Artículo extends Escrito{

    private String tema;
    private String opinion;

    public void setTema (String tema) {
        this.tema = tema;
    }

    public void setOpinion (String opinion) {
        this.opinion = opinion;
    }

    public Artículo(String categoria, Character inicial, int año) {
        super(categoria, inicial, año);
    }
}
