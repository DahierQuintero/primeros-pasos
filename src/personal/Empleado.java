package personal;

public class Empleado extends Persona{

    private int horario;

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public Empleado(String nombre, String apellidos, int edad, int horario) {
        super(nombre, apellidos, edad);
        this.horario = horario;
    }
}
