package carro;

class Carro {

    private int ruedas;
    private String marca;
    private String color;
    private int peso;

    public Carro () {


    }

    public void setRuedas (int ruedas) {

        this.ruedas = ruedas;
    }

    public int getRuedas () {

        return ruedas;
    }

    public void setMarca (String marca) {

        this.marca = marca;

    }

    public String getMarca () {

        return marca;
    }

    public void setColor (String color) {

        this.color = color;

    }

    public String getColor () {

        return color;
    }

    public void setPeso (int peso) {

        this.peso = peso;

    }

    public int getPeso () {

        return peso;
    }

    public String setDatosGenerales () {

        return "El carro es de la marca " + marca + ", es de color " + color + ", tiene " + ruedas + " ruedas, y pesa "
                + peso + " kg";
    }
}
