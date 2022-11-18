package personal;

public class Directivo extends Persona{

    private int experiencia;

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public Directivo(String nombre, String apellidos, int edad, int experiencia) {
        super(nombre, apellidos, edad);
        this.experiencia = experiencia;
    }
}
