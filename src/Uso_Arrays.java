public class Uso_Arrays {
    public static void main(String[] args) {

        /*int [] mi_matriz = new int[5];

        mi_matriz[0] = 10;
        mi_matriz[1] = 15;
        mi_matriz[2] = 12;
        mi_matriz[3] = 14;
        mi_matriz[4] = 13;*/

        int [] mi_matriz={10,15,12,14,13,17,18,19,22};

        for (int i=0; i<mi_matriz.length;i++) {

            System.out.println("Valor del indice " + i + " = " + mi_matriz[i]);
        }
    }
}
