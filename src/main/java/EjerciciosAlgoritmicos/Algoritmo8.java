package EjerciciosAlgoritmicos;

import java.util.Scanner;

public class Algoritmo8 {

    public static void main(String[] args) {
        //Programa que pida el precio de un artículo y calcule su valor aplicando
        //un 16% de IVA.
        //Realiza un programa para calcular el valor de cualquier artículo aplicando
        //cualquier IVA.
        
        //Creamos la constante
        final double IVA16 = 16;
        
        
        //Creamos el input
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        
        //Pedimos el precio
        System.out.println("¿Cual es el precio base?");
        double base = teclado.nextDouble();
        
        
        //Pedimos el IVA propuesto
        System.out.println("¿Aparte del 16% con que otro IVA quiere verlo? ");
        double iva = teclado.nextDouble();
        
        
        //Realizamos los calculos
        double resultadoIVA16 = (base * IVA16 / 100) + base;
        double resultadoIVAProp = (base * iva / 100) + base;
        
        //Devolvemos el resultado
        System.out.println("El total con el 16% de IVA seria de: " + resultadoIVA16 + "\n" +
                           "El total con el " + iva + "%" + " seria de: " + resultadoIVAProp);
    }
    
}
