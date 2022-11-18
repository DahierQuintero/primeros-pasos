public class Triki {

    char [][] matriz;

    public Triki(){
        matriz = new char[][]{{'a', 'a', 'a'}, {'a', 'a', 'a'}, {'a', 'a', 'a'}};
    }

    public void marcarCasilla(String simbolo, int fila, int columna){
        matriz[fila][columna] = simbolo.charAt(0);
    }

    public char[][] getMatriz() {
        return matriz;
    }

    public void verificarGanador() {

        if (matriz[0][0] == 'X' && matriz [1][0] == 'X' && matriz [2][0] == 'X'){
            System.out.println("El ganador es X " );
        }
        if (matriz[0][0] == 'O' && matriz [1][0] == 'O' && matriz [2][0] == 'O'){
            System.out.println("El ganador es O " );
        }
        if (matriz[0][1] == 'X' && matriz [1][1] == 'X' && matriz [2][1] == 'X'){
            System.out.println("El ganador es X " );
        }
        if (matriz[0][1] == 'O' && matriz [1][1] == 'O' && matriz [2][1] == 'O'){
            System.out.println("El ganador es O " );
        }
        if (matriz[0][2] == 'X' && matriz [1][2] == 'X' && matriz [2][2] == 'X'){
            System.out.println("El ganador es X " );
        }
        if (matriz[0][2] == 'O' && matriz [1][2] == 'O' && matriz [2][2] == 'O'){
            System.out.println("El ganador es O " );
        }
        if (matriz[0][0] == 'X' && matriz [0][1] == 'X' && matriz [0][2] == 'X'){
            System.out.println("El ganador es X " );
        }
        if (matriz[0][0] == 'O' && matriz [0][1] == 'O' && matriz [0][2] == 'O'){
            System.out.println("El ganador es O " );
        }
        if (matriz[1][0] == 'X' && matriz [1][1] == 'X' && matriz [1][2] == 'X'){
            System.out.println("El ganador es X " );
        }
        if (matriz[1][0] == 'O' && matriz [1][1] == 'O' && matriz [1][2] == 'O'){
            System.out.println("El ganador es O " );
        }
        if (matriz[2][0] == 'X' && matriz [2][1] == 'X' && matriz [2][2] == 'X'){
            System.out.println("El ganador es X " );
        }
        if (matriz[2][0] == 'O' && matriz [2][1] == 'O' && matriz [2][2] == 'O'){
            System.out.println("El ganador es O " );
        }
        if (matriz[0][0] == 'X' && matriz [1][1] == 'X' && matriz [2][2] == 'X'){
            System.out.println("El ganador es X " );
        }
        if (matriz[0][0] == 'O' && matriz [1][1] == 'O' && matriz [2][2] == 'O'){
            System.out.println("El ganador es O " );
        }
        if (matriz[0][2] == 'X' && matriz [1][1] == 'X' && matriz [2][0] == 'X'){
            System.out.println("El ganador es X " );
        }
        if (matriz[0][2] == 'O' && matriz [1][1] == 'O' && matriz [2][0] == 'O'){
            System.out.println("El ganador es O " );
        }

    }
    public char verificarCasilla(int fila, int columna) {
        return matriz [fila][columna];
    }

}
