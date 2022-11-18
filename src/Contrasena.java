public class Contrasena {

    int longitud = 8;
    String contrasena;

    public Contrasena(int longitud){
        this.longitud = longitud;
        contrasena = generaContrasena();
    }

    public String generaContrasena(){
        char[] mayus = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] minus = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] numeros = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

        StringBuilder caracteres = new StringBuilder();
        caracteres.append(mayus);
        caracteres.append(minus);
        caracteres.append(numeros);

        StringBuilder contrasena = new StringBuilder();

        for (int i = 0; i <= longitud; i++){
            int cantidadCaracteres = caracteres.length();
            int numerorandom = (int)(Math.random()*cantidadCaracteres);

            contrasena.append((caracteres.toString()).charAt(numerorandom));

        }

        return contrasena.toString();
    }
    public boolean esFuerte(){
        int mayuscula = 0;
        int minuscula = 0;
        int numero = 0;

        for (int i = 0; i< contrasena.length(); i++) {
            if (Character.isUpperCase(contrasena.charAt(i))){
                mayuscula ++;
            }
            if (Character.isLowerCase(contrasena.charAt(i))){
                minuscula ++;
            }
            if (Character.isDigit(contrasena.charAt(i))){
                numero ++;
            }
        }
        if (mayuscula>0 && minuscula>0 && numero>5) {
            return true;
        }
        return false;
    }

    public void cambiarContrasena (String nuevacontrasena){
        this.contrasena = nuevacontrasena;
        this.longitud = nuevacontrasena.length();
    }

    @Override
    public String toString() {
        return "Contrasena " + '\n'+ '\t' +
                "Longitud = " + longitud + "\n\t" +
                "Contraseña = " + contrasena + "\n\t";
    }
}
