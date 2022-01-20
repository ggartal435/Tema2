package p21GabrielGarcia;

import java.util.Scanner;

public class ParteA {

    public static void main(String[] args) {
      //Creamos un objeto Scanner
      Scanner teclado;
      teclado = new Scanner(System.in);
      //comentario de prueba
      //Puesto que el numero de horas de los master y de trabajo de
      //los profesores no van ha cambiar las inicializamos como constantes.
      final int HORAS_MASTER = 975;
      final int HORAS_PROFESORES = 150;
      
      //Preguntamos el numero de masters que se van ha realizar
        System.out.println("¿Cuantos Masters se realizaran este año?");
        int masters = teclado.nextInt();
        
      //Calculamos el numero de horas totales en los masters
      int totalHoras = masters * HORAS_MASTER;
      
      //Calculamos el numero de profesores que tienen que haber para poder dar
      //el total de horas. Redondeamos y quitamos decimales
      
      double totalProfesores = totalHoras / HORAS_PROFESORES;
      int resultado = (int)Math.ceil(totalProfesores);
      
      
      
      //Ahora que tenemos el total de profesores, lo sacamos por consola pero
      //redondeandolo para arriba
      System.out.printf("El minimo de profesores ha de ser de " + resultado);
    }
    
}
