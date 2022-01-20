package EjerciciosAlgoritmicos;

import java.net.URL;
import java.util.Scanner;

public class Algoritmo11 {

    public static void main(String[] args) {
        //Realiza un programa para calcular la distancia entre dos puntos
        //en un plano cartesiano, a partir de las coordenadas de los mismos.
        //Utiliza el teorema de Pitágoras

        //La formula es Distancia =  Math.sqrt(Math-pow((x2-x1))+Math.pow((y2-y1))  
        //informacion extrida de: https://www.geometriaanalitica.info/formula-de-la-distancia-entre-dos-puntos-geometria-ejemplos-y-ejercicios-resueltos/#%c2%bfcual-es-la-formula-de-la-distancia-entre-dos-puntos
        
        Scanner teclado;
        teclado = new Scanner(System.in);

        //Pedimos las coordenadas del punto a
        System.out.println("Punto 1 eje X: ");
        double x1 = teclado.nextInt();
        System.out.println("Punto A eje Y: ");
        double y1 = teclado.nextInt();

        //Pedimos coordenada punto b
        System.out.println("Punto 2 eje X: ");
        double x2 = teclado.nextInt();

        System.out.println("Punto 2 eje Y: ");
        double y2 = teclado.nextInt();

        //simplificamos coordenadas para hacer el calculo
        double x3 = x2 - x1;
        double y3 = y2 - y1;

        //Hacemos las potencias
        double xFinal = Math.pow(x3, 2);
        double yFinal = Math.pow(y3, 2);

        //Hacemos la raiz cuadrada
        double distanciaAB = Math.sqrt(xFinal + yFinal);

        System.out.println("La distancia entre los puntos A y B es de: " + distanciaAB + " unidades");

    }

}
