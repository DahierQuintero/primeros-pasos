package serie;

public class Videojuego implements Entregable {

    //Atributos
    private String titulo;
    private double horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compañia;

    //Constantes
    protected final static double horasEstimadasDef = 10;
    protected final static boolean entregadoDef = false;
    protected final static String tituloDef = "NN";
    protected final static String generoDef = "Familia";
    protected final static String compañiaDef = "Flow Factory";

    //Constructores
    public Videojuego () {
        titulo = tituloDef;
        horasEstimadas = horasEstimadasDef;
        entregado = entregadoDef;
        genero = generoDef;
        compañia = compañiaDef;
    }

    public Videojuego (String titulo, double horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        entregado = entregadoDef;
        genero = generoDef;
        compañia = compañiaDef;
    }

    public Videojuego (String titulo, double horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compañia = compañia;
    }

    //Metodos Getter
    public String getTitulo() {
        return titulo;
    }

    public double getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompañia() {
        return compañia;
    }

    //Metodos Setter

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(double horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    //Metodo toString

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compañia='" + compañia + '\'' +
                '}';
    }
}
