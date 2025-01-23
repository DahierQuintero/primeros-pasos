package zoo;

public class Vaca extends Animal{

    private String raza;

    public Vaca (String nombre, String color, int edad, String raza) {
        super(nombre, color, edad);
        this.raza = raza;
    }

    public void pastar() {
        System.out.println("La vaca empieza a comer");
    }
    public String getRaza() {
        return  raza;
    }
    public String toString() {
        return "El nombre de la vaca es " + getNombre() + ". El color de " + getNombre() + " es " + getColor() + ". Tiene " +
                getEdad() + " años. Y " + getNombre() + " es de raza " + getRaza();

    }
}
