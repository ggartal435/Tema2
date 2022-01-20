package EjerciciosAlgoritmicos;

import java.util.Scanner;

public class Algoritmo2 {

    public static void main(String[] args) {
        //Algoritmo que lea el valor del radio y calcule el área del círculo.

        //Creamos el Scanner que despues habra que importar
        Scanner teclado;
        teclado = new Scanner(System.in);

        //Pedimos el valor del radio
        System.out.println("¿Cual es el valor del radio?(En cm)");
        double radio = teclado.nextDouble();
        //double radio2= Math.pow(radio, radio);

        //hacemos la formula PI*radio*radio
        double radio2= Math.pow(radio, 2);
        double resultadoRadio = Math.PI * radio2;

        //Mostramos resultado
        System.out.println("El area es de: " + resultadoRadio + "cm");

    }

}
