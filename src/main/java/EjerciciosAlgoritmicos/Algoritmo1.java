package EjerciciosAlgoritmicos;

import java.util.Scanner;

public class Algoritmo1 {

    public static void main(String[] args) {
        //Algoritmo que lea una cantidad de euros y los pase a rupias indias
        
        //Creamos la constante para pasar a rupias
        final double CONVERSION_RUPIA = 86.67;

        //Creamos una manera de pedir los datos con la clase teclado.
        //Llamamos al metodo Scanner que luego habra que importar
        Scanner teclado;

        //Asignamos un nuevo metodo Scanner a la variable teclado
        teclado = new Scanner(System.in);

        //Preguntamos la cantidad a convertir
        System.out.println("¿Cuantos euros quieres convertir?");
        double euro = teclado.nextDouble();

        //Realizamos la conversion
        double rupia = euro * CONVERSION_RUPIA;

        //Output resultado
        System.out.println("La conversion de " + euro + " seria de: " + rupia
                + " Rupias");
    }

}
