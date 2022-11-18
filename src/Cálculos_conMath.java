public class Cálculos_conMath {
    public static void main(String[] args) {

        //Raiz cuadrada de un número
        double raiz=Math.sqrt(8);

        System.out.println(raiz);

        //Redondear un número
        double num1=5.79;

        int resultado=(int)Math.round(num1);

        System.out.println(resultado);

        //Elevar potencias

        double base=5;

        double exponente=3;

        int resultado2=(int)Math.pow(base,exponente);

        System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + resultado2);

    }
}
