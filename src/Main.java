import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*Persona persona1 = new Persona("Juan Pa",22,"H", 80.0,1.88);
        System.out.println(persona1);
        persona1.calcularIMC();
        persona1.esMayorDeEdad();


        Contrasena contrasena1 = new Contrasena(20);
        System.out.println(contrasena1);
        System.out.println(contrasena1.esFuerte());
        contrasena1.cambiarContrasena("Ronaldo");
        System.out.println(contrasena1);
        */
        Triki triki1 = new Triki();
        for (char[] X: triki1.getMatriz()){
            System.out.println(Arrays.toString(X));
        }

        triki1.marcarCasilla("O", 0,0);
        for (char[] X: triki1.getMatriz()){
            System.out.println(Arrays.toString(X));
        }
        triki1.marcarCasilla("X",2,2);
        for (char[] X: triki1.getMatriz()){
            System.out.println(Arrays.toString(X));
        }
        triki1.marcarCasilla("O", 1,0);
        for (char[] X: triki1.getMatriz()){
            System.out.println(Arrays.toString(X));
        }
        triki1.marcarCasilla("X", 2,1);
        for (char[] X: triki1.getMatriz()){
            System.out.println(Arrays.toString(X));
        }
        triki1.marcarCasilla("O", 2,0);
        for (char[] X: triki1.getMatriz()){
            System.out.println(Arrays.toString(X));
        }
        triki1.verificarGanador();
        triki1.verificarCasilla(0,2);
    }
}
