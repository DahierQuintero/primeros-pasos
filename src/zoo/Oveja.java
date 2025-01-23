package zoo;

public class Oveja extends Animal{

    private boolean lana;

    public Oveja(String nombre, String color, int edad, boolean lana) {
        super(nombre, color, edad);
        this.lana = lana;
    }
    public String getLana() {
        if(lana) {
            return "produce lana";
        }
        else {
            return "no produce lana";
        }
    }
    public String toString() {
        return "El nombre de la oveja es " + getNombre() + ". El color de " + getNombre() + " es " + getColor() + ". Tiene " +
                getEdad() + " años. Y " + getNombre() + " " + getLana();
    }
}
