import javax.swing.*;
public class Acceso_Aplicación {
    public static void main(String[] args) {

        String clave = "katemiamor";
        String password = "";

        while (clave.equals(password) == false){

            password = JOptionPane.showInputDialog("Ingrese su contraseña, por favor");

            if (clave.equals(password) == false){

                System.out.println("Contraseña incorrecta, intenta nuevamente");
            }

        }
        System.out.println("Contraseña correcta. Acceso permitido");
    }
}
