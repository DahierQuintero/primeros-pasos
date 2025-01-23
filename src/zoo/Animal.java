package zoo;

public class Animal {

    private String nombre;
    private String color;
    private int edad;

    public Animal (String nombre, String color, int edad){

        this.nombre = nombre;
        this.color = color;
        this.edad = edad;

    }
    public void cambiarEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getColor() {
        return color;
    }
    public int getEdad() {
        return edad;
    }
}
