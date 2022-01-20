package EjerciciosAlgoritmicos;

import java.util.Scanner;

public class Algoritmo5 {

    public static void main(String[] args) {
        /* Una empresa de autocares cobra 150 euros fijos por servicio
           y además 15.3 céntimos por Km recorrido.
           Elabora un programa que lea el número de km a recorrer y proporcione
           el presupuesto.
         */
        //Creamos las constantes
        final double SERVICIO = 150;
        final double KMRECORRIDO = 0.153;

        //Creamos el Scanner
        Scanner teclado;
        teclado = new Scanner(System.in);

        //Creamos y pedimos el num de km
        double kmrecorrer;

        System.out.println("¿Cuantos Km quiers recorrer?");
        kmrecorrer = teclado.nextDouble();

        //Hacemos el calculo
        double presupuesto = ( kmrecorrer * KMRECORRIDO ) + SERVICIO;

        //Output resultado
        System.out.println("El presupuesto seria de: " + presupuesto + " Euros");

    }

}
