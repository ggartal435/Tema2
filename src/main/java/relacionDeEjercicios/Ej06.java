package relacionDeEjercicios;

import java.util.Scanner;

public class Ej06 {

    public static void main(String[] args) {
        int a , b , c;
        a = 0;
        b = 0;
        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("El valor de a es actualmente de: " + a);
        System.out.println("Que valor quieres que tenga a: ");
        a = teclado.nextInt();
        System.out.println("El valor de b es actualmente de: " + b);
        System.out.println("Que valor quieres que tenga b: ");
        b = teclado.nextInt();
        c = a;
        a = b;
        b = c;
        System.out.println("El valor actual a es de: " + a);
        System.out.println("El valor actual de b es de: " + b);
        
    }
    
}