package EjerciciosAlgoritmicos;

import java.util.Scanner;

public class Algoritmo9 {

    public static void main(String[] args) {
        //Una empresa de juguetes se dedica a realizar cometas como las que 
        //figuran en la imagen de la derecha. Necesitan saber el área de tela a emplear 
        //según las medidas de las diagonales que hay entre los puntos A y C, y entre B y D.
        //Area rombo= D*d/2
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        System.out.println("Introduce la primera diagonal:");
        double diagonal1 = teclado.nextDouble();
        
        
        System.out.println("Introduce la segunda diagonal:");
        double diagonal2 = teclado.nextDouble();
        
        double resultado = (diagonal1 * diagonal2) / 2;
        
        System.out.printf("El area de la cometa de la primera diagonal %.1f y de la segunda diagonal %.1f es de %.3f cm2", diagonal1, diagonal2, resultado);
    }
    
}
