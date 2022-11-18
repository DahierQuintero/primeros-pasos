package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class  UsoEmpleado {

    public static void main(String[] args) {

        Empleado[] misEmpleados = new Empleado[4];

        misEmpleados[0] = new Empleado("Carlos", 1300000, 2005, 12,17);

        misEmpleados[1] = new Empleado("Ana", 1400000,2008,10,05);

        misEmpleados[2] = new Empleado("Lucas", 1500000,2010,05,26);

        misEmpleados[3] = new Empleado("Marcos");

        /*for (int i = 0; i < 3; i++){

            misEmpleados[i].subeSueldo(5);

        }*/
        for (Empleado e: misEmpleados){

            e.subeSueldo(5);
        }

        /*for (int i = 0; i < 3; i++ ){

            System.out.println("Nombre: " + misEmpleados[i].dameNombre() + "\nSueldo: " + misEmpleados[i].dameSueldo() + "\nFecha de Alta: " + misEmpleados[i].dameFechaContrato() + "\n");
        }*/
        for (Empleado e: misEmpleados){

            System.out.println("Nombre: " + e.dameNombre() + "\nSueldo: " + e.dameSueldo() + "\nFecha de Alta: " + e.dameFechaContrato() + "\n");
        }

    }
}

class Empleado{

    public Empleado(String nom, double sue, int agno, int mes, int dia){

        nombre = nom;

        sueldo = sue;

        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);

        altaContrato = calendario.getTime();
    }

    public Empleado(String nom){

        this(nom, 30000, 2000, 01,01);


    }

    public String dameNombre(){//GETTER

        return nombre;
    }

    public double dameSueldo(){//GETTER

        return sueldo;
    }

    public Date dameFechaContrato(){//GETTER

        return altaContrato;
    }

    public void subeSueldo(double porcentaje){//SETTER

        double aumento = sueldo*porcentaje/100;

        sueldo += aumento;
    }

    private String nombre;
    private double sueldo;
    private Date altaContrato;
}
