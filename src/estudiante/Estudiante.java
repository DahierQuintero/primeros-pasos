package estudiante;

class Estudiante {

    private String nom;
    private int grado;

    public Estudiante(String nom, int grado) {

        this.nom = nom;
        this.grado = grado;
    }

    public String dameDatos() {

        return "El nombre del estudiante es: " + nom + " y esta en grado " + grado;
    }
}
