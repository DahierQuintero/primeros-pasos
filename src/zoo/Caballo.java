package zoo;

public class Caballo extends Animal{

    private boolean pasoFino;

    public Caballo(String nombre, String color, int edad, boolean pasoFino) {
        super(nombre, color, edad);
        this.pasoFino = pasoFino;
    }

    public String getPasoFino() {
        if (pasoFino) {
            return  "Es de paso fino";
        }
        else {
            return  "Es de paso fino";
        }
    }
    public String toString() {
        return "El nombre del caballo es " + getNombre() + ". El color de " + getNombre() + " es " + getColor() + ". Tiene " +
                getEdad() + " años. Y " + getNombre() + " " + getPasoFino();

    }

}
