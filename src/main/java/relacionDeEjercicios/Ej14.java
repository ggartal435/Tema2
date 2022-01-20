package relacionDeEjercicios;

import java.util.Scanner;

public class Ej14 {

    public static void main(String[] args) {
        //El programa tendrá una variable entera tiempo inicializada con un valor
        //leído por teclado, en segundos, y queremos conocer este tiempo pero expresado
        //en horas, minutos y segundos, mostrando los resultados por pantalla
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        System.out.println("Dime una cantidad de segundos");
        int entrada = teclado.nextInt();
        
        final int CONVER = 3600;
        
        int horas = entrada / CONVER;
        int minutos = (entrada % CONVER) / 60;
        int segundos = (entrada % CONVER) % 60;
        
        
        
        System.out.println("Los segundos dados equivaldrian a: " + horas + 
                " horas y " + minutos + " minutos" + segundos + " y segundos");
    }
    
}
