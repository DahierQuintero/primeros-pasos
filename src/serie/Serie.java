package serie;

public class Serie implements Entregable {

    //Atributos
    private String titulo;
    private int numeroDeTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    //Constantes
    protected final static String tituloDef = "NN";
    protected final static int numeroDeTemporadasDef = 3;
    protected final static boolean entregadoDef = false;
    protected final static  String generoDef = "Familia";
    protected final static String creadorDef = "Pina Records";

    public Serie() {
        titulo = tituloDef;
        numeroDeTemporadas = numeroDeTemporadasDef;
        entregado = entregadoDef;
        genero = generoDef;
        creador = creadorDef;
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        numeroDeTemporadas = numeroDeTemporadasDef;
        entregado = entregadoDef;
        genero = generoDef;
    }

    public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    //Metodos Getter
    public String getTitulo () {
        return titulo;
    }

    public int getNumeroDeTemporadas () {
        return numeroDeTemporadas;
    }

    public String getGenero () {
        return genero;
    }

    public String getCreador () {
        return creador;
    }

    //Metodos Setter
    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroDeTemporadas (int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public void setGenero (String genero) {
        this.genero = genero;
    }

    public void setCreador (String creador) {
        this.creador = creador;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroDeTemporadas=" + numeroDeTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }


}
