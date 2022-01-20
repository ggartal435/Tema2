package p21GabrielGarcia;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ParteB {

 public static void main(String[] args) {
      //Creamos un objeto Scanner
      Scanner teclado;
      teclado = new Scanner(System.in);
      
      //Puesto que el numero de horas de los master y de trabajo de
      //los profesores no van ha cambiar las inicializamos como constantes.
      final int HORAS_MASTER = 975;
      final int HORAS_PROFESORES = 150;
      
      //Preguntamos el numero de masters que se van ha realizar
       String masters= JOptionPane.showInputDialog(null, "¿Cuantos Masters se realizaran este año?");
        
      //Transformamos el string a int
      
        int mastersInt =  Integer.parseInt(masters);
        
      //Calculamos el numero de horas totales en los masters
      int totalHoras = mastersInt * HORAS_MASTER;
      
      //Calculamos el numero de profesores que tienen que haber para poder dar
      //el total de horas.
      
      double totalProfesores = totalHoras / HORAS_PROFESORES;
      
      //Redondeamos y quitamos decimales
      int resultado = (int)Math.ceil(totalProfesores);
      
      //Ahora que tenemos el total de profesores, lo sacamos por consola pero
      //redondeandolo para arriba
      JOptionPane.showMessageDialog(null, "El minimo de profesores ha de ser: " + resultado);
    }
    
}
