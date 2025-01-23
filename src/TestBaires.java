import java.text.DecimalFormat;
import java.util.Scanner;

public class TestBaires {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        Integer age;
        Double weight, height;

        System.out.println("Ingresa los siguientes datos:\n1)Nombre " );
        name = sc.nextLine();
        System.out.println("2)Edad");
        age = sc.nextInt();
        System.out.println("3)Peso (en kilogramos)");
        weight = sc.nextDouble();
        System.out.println("4)Altura (en metros)");
        height = sc.nextDouble();

        System.out.println(name + " con " + age + " anios su indice de masa corporal es: " + indiceMasaCoporal(weight,height) + " imc");
    }
    public static String indiceMasaCoporal(double weight, double height) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(weight/(height * height));
    }
}
