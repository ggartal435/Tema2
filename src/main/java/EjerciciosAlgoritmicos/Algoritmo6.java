package EjerciciosAlgoritmicos;

import java.util.Scanner;

public class Algoritmo6 {

    public static void main(String[] args) {
        //Leer dos números por teclado, a y b.
        //Imprimir por pantalla el resultado de las siguientes operaciones:
        //a/b   y   a%b
        
        
        //Creamos el teclado
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        //Le pedimos el primer valor
        System.out.println("Dime el primer valor:");
        double a = teclado.nextDouble();
        
        //Le pedimos el segundo valor
        System.out.println("Dime el segundo valor:");
        double b = teclado.nextDouble();
        
        //Mostramos los resultado
        System.out.println("El resultado de la division es: " + (a/b));
        System.out.println("El resto de la division es: " + (a%b));
    }
    
}
