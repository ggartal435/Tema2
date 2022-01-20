package EjerciciosAlgoritmicos;

import java.util.Scanner;

public class Algoritmo4 {

    public static void main(String[] args) {
        //Realiza un programa que lea una cantidad de gramos y 
        //obtenga su equivalencia en libras.

        //Creamos el input del teclado
        Scanner teclado;
        teclado = new Scanner(System.in);

        final double CONVERSIONLIBRAS = 0.00220462;

        //Preguntamos el peso
        System.out.println("¿Cual es el peso en gramos?");
        double gramos = teclado.nextDouble();

        //Realizamos la conversion y mostramos el resultado
        double resultado = gramos * CONVERSIONLIBRAS;

        System.out.println("La conversion es de: " + resultado + " Libras");

    }

}
