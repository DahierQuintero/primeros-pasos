public class Manipula_Cadenas2 {
    public static void main(String[] args) {

        String frase="Todos los días son estupendos para aprender a programar, sí señor!";

        String frase_resumen=frase.substring(0,35);

        System.out.println(frase_resumen + " ir a puebliar con la familia y amigos " + " y de paso " +
        frase.substring(36,65));
    }
}
