package estudiante;

public class Main {

    public static void main(String[] args) {

        Estudiante alumno1 = new Estudiante("Emily", 9);
        Estudiante alumno2 = new Estudiante("Dilan", 11);
        Estudiante alumno3 = new Estudiante("Dahier", 10);

        System.out.println(alumno1.dameDatos());
        System.out.println(alumno2.dameDatos());
        System.out.println(alumno3.dameDatos());
    }



}
