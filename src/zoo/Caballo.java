package zoo;

public class Caballo extends Animal{

    private boolean pasoFino;

    public Caballo(String nombre, String color, int edad, boolean pasoFino) {
        super(nombre, color, edad);
        this.pasoFino = pasoFino;
    }

    public void setPasoFino() {
        if (pasoFino) {
            System.out.println("El caballo es de paso fino");
        }
        else {
            System.out.println("El caballo no es de paso fino");
        }
    }

}
