public class Funciones {
    public static void main(String[] args) {

        System.out.println("El volumen del sólido es " + (CalcularMasaEsfera(10.0) + CalcularMasaCono(10.0,2.0)));


    }

    protected static Double CalcularMasaEsfera(Double r){
        return 4.0/3.0 * Math.PI * Math.pow(r,3);
    }

    protected static Double CalcularMasaCono(Double r2, Double h){
        return Math.PI * Math.pow(r2,2) * h/3;
    }
}
