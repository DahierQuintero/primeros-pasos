package banco;

public class Main {

    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta("Carla");
        Cuenta cuenta2 = new Cuenta("Dahier", 3000);

        cuenta1.ingresar(22500);
        cuenta2.ingresar(45500);

        cuenta1.retirar(30000);
        cuenta2.retirar(5000);

        System.out.println(cuenta1);
        System.out.println(cuenta2);

    }
}
