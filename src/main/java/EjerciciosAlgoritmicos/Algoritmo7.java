package EjerciciosAlgoritmicos;

import java.util.Scanner;

public class Algoritmo7 {

    public static void main(String[] args) {
        //Un productor de leche lleva el registro de lo que produce en litros,
        //pero cuando entrega la leche en la distribuidora le pagan
        //según los galones entregados (1 galón son 3,78 litros).
        //Escribe un programa que ayude al productor a saber cuánto recibirá por
        //la entrega de su producción de un día, sabiendo que el precio del galón
        //es 1.20€.
        
        //Creamos las constantes
        final double LITROS_GALONES = 3.78;
        final double PRECIO_GALON = 1.20;
        
        //Creamos el input
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        //Le pedimos el numero de litros
        System.out.println("¿Litros a entregar?");
        double litros = teclado.nextDouble();
        
        //Sacamos el resultado
        System.out.println("Le van ha pagar: " + ( (litros * LITROS_GALONES) * PRECIO_GALON) );
        
    }

}
