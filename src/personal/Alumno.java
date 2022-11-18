package personal;

public class Alumno extends Persona{

    private int notaFinal;

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }


    public Alumno(String nombre, String apellidos, int edad) {

        super(nombre, apellidos, edad);
    }
}
