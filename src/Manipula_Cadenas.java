public class Manipula_Cadenas {
    public static void main(String[] args) {

        String nombre="Dilan Dahier Quintero Rivera";

        System.out.println("Mi nombre es " + nombre);

        System.out.println("Mi nombre tiene "+ nombre.length() + " letras.");

        System.out.println("La primera letra de " + nombre + " es la " + nombre.charAt(0));

        int ultima_letra=nombre.length();

        System.out.println("La última letra es "+ nombre.charAt(ultima_letra-1));

        int num = 105;
        String letra2 = "a";

        System.out.println(Character.toChars(num));


    }
}
