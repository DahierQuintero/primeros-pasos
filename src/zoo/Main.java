package zoo;

public class Main {

    public static void main(String[] args) {

        Caballo caballo1 = new Caballo("Austin","Negro",5, true);
        System.out.println(caballo1.toString());

        Vaca vaca1 = new Vaca("Carlota", "blanca con manchas negras", 7,"Lechera");
        System.out.println(vaca1.toString());

        Oveja oveja1 = new Oveja("Keylor", "negra", 7,true);
        System.out.println(oveja1.toString());

    }
}
