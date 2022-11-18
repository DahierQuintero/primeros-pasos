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

    public String getNombre() {
        return "El nombre del animal es " + nombre;
    }

    public String getColor() {
        return "El color del animal es " + color;
    }

    public int getEdad() {
        return edad;
    }
}
