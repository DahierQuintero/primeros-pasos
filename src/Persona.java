public class Persona {
    String nombre;
    int edad;
    String genero;
    double peso;
    double altura;



    public Persona (String nombre, int edad, String genero, double peso, double altura){

        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;

    }

public void calcularIMC(){

    System.out.println("El IMC de " + nombre + " es: " + (peso/(altura*altura)));

}
public void esMayorDeEdad(){
        if(edad<18){
            System.out.println(nombre + " eres menor de edad");
        }
        else {
            System.out.println(nombre + " eres mayor de edad");
        }
}

    @Override
    public String toString() {
        return "Persona " +
                "Nombre = " + nombre + '\n' + '\t' +
                "Edad = " + edad + '\n' + '\t' +
                "Género = " + genero + '\n' + '\t' +
                "Peso = " + peso + '\n' + '\t' +
                "Altura = " + altura;
    }
}
