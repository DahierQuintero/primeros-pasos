import javax.swing.*;

public class Comprueba_email {
    public static void main(String[] args) {

        int arroba = 0;

        boolean punto = false;

        String email = JOptionPane.showInputDialog("Ingresa tu email");

        for(int i=0; i<email.length(); i++){

            if(email.charAt(i)=='@'){

                arroba++;
            }
            if(email.charAt(i)=='.'){
                punto = true;
            }
        }

        if(arroba == 1 && punto){

            System.out.println("La dirección de email es válida");
        }
        else{
            System.out.println("La dirección de email es incorrecta");
        }

    }
}
