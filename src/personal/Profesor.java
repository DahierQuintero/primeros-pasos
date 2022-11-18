package personal;

public class Profesor extends Persona{

    private String area;

    public void setArea (String area) {
        this.area = area;
    }


    public Profesor(String nombre, String apellidos, int edad, String area) {
        super(nombre, apellidos, edad);
        this.area = area;
    }
}
