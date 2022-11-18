package persona;

import java.util.Random;

public class Persona {

    private String nombre;
    private int edad;
    private int dni;
    private char sexo = 'H';
    private double peso;
    private double altura;

    public Persona() {

        this.dni = generaDNI();
        nombre = " ";
        edad = 0;
        peso = 0;
        altura = 0;
    }

    public Persona(String nombre, int edad, char sexo) {

        this.dni = generaDNI();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        peso = 0;
        altura = 0;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {

        this.dni = generaDNI();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String calcularIMC() {
        double imc;

        if(peso/(altura*altura) < 20) {

            imc = -1;
        }
        else if(peso/(altura*altura) >= 20 && peso/(altura*altura) <= 25) {

            imc = 0;
        }
        else {
            imc = 1;
        }
        return "El indice de masa corporal de " + nombre + " es " + imc;
    }

    public boolean esMayorDeEdad() {
        boolean comprobarEdad;

        if (edad >= 18) {
            comprobarEdad = true;
        }
        else {
            comprobarEdad = false;
        }
        return comprobarEdad;
    }
    public void comprobarSexo(char sexo) {
        if (sexo == 'M' / 'm' ) {

            this.sexo = sexo;
        }
        else {

        }
    }

    public String toString() {

        return "Tu nombre es " + nombre + " tienes: " + edad + " años. Tu numero de DNI es: " + dni + " .Tu sexo es: "
                + sexo + ", tu peso es: " + peso + " y tu altura es: " + altura;
    }

    public int generaDNI() {
        double documento = Math.random() * 100_000_000;

        return (int) documento;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public void setEdad (int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {

        this.sexo = sexo;
    }

    public void setPeso(double peso) {

        this.peso = peso;
    }

    public void setAltura(double altura) {

        this.altura = altura;
    }

}
