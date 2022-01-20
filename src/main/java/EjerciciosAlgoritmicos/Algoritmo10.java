package EjerciciosAlgoritmicos;

import javax.swing.JOptionPane;

public class Algoritmo10 {

    public static void main(String[] args) {
        //Realiza un programa que calcule el espacio recorrido, en metros, 
        //por un cuerpo que se deplaza a 200 km/h si está en movimiento 20 minutos. 
        //Realiza otro programa para calcular el espacio recorrido del cuerpo
        //en función de su velocidad y tiempo de movimiento.


        //Conversion Horas a minutos y Kilometros a metros
        final double H_MIN = 60;
        final double KM_M = 1000;
        
        //Hacemos un cuadro preguntando los Km/hora que se guardara como un String
        String kmH = JOptionPane.showInputDialog(null, "Introduce los Km/h");
        //Tenemos que convertir el String a Double
        double kilometroHora = Double.parseDouble(kmH);

        //Hacemos un cuadro que pregunte el tiempo
        String tiempo = JOptionPane.showInputDialog(null,"introduce el tiempo");
        //Pasamos el String a Double
        double totalTiempo = Double.parseDouble(tiempo);
        
        //Transformamos los km a metros
        double totalMetros = kilometroHora * KM_M;
        
        //Hacemos el calculo:
        
        double resultado = totalMetros;
        
    }
    
}
