public class Arrays_Bidimensionales {

    public static void main(String[] args) {

        int [][] matrix= {
                {18,14,26,86,42},
                {38,44,25,76,98},
                {68,74,56,87,49},
                {88,17,25,76,92},
        };

        for(int[]fila:matrix){

            System.out.println();

            for(int z:fila){

                System.out.print("(" + z + ") ");
            }
        }


    }
}
