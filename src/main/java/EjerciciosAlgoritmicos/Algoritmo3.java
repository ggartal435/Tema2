package EjerciciosAlgoritmicos;

import java.util.Scanner;

public class Algoritmo3 {

    public static void main(String[] args) {
        // Algoritmo que lea tres notas numéricas de tipo double y calcule la nota media

        //Creamos el input del teclado
        Scanner teclado;
        teclado = new Scanner(System.in);

        //Pedimos los datos
        System.out.println("Para calcular su media por favor introduzca sus notas");

        System.out.println("Primera nota:");
        double a = teclado.nextDouble();

        System.out.println("Segunda nota:");
        double b = teclado.nextDouble();

        System.out.println("Tercera nota:");
        double c = teclado.nextDouble();

        //Hacemos la media y mostramos resultado
        double notaMedia = (a + b + c) / 3;

        System.out.println("Su nota media es de: " + notaMedia);

    }

}
