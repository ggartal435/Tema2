package relacionDeEjercicios;

import java.util.Scanner;

public class DatosPersonales {
    public static void main(String[] args) {
        //Inicializacion del metodo Scanner como entrada de teclado
        Scanner teclado = new Scanner(System.in);
        
        //Con el sout preguntamos el nombre
        System.out.println("¿Como te llamas?");
        
        //Creamos un String donde se guarda el nombre del usuario
        String nombre = teclado.nextLine();
        
        //Preguntamos dia de nacimiento
        System.out.println("¿Que dia naciste?");
        
        //Creamos short con el dia de nacimiento 
        short dia = teclado.nextShort();
        
        //Como voy ha leer un texto despues de un numero limpio el buffer
        //(da igual el tipo de nº que sea 
        System.out.println("¿Que mes naciste?");
        
        //Creamos string con el mes de nacimiento
        teclado.nextLine();
        String mes = teclado.nextLine();
        
        //Creamos short con el año de nacimiento 
        System.out.println("¿Que año naciste?");
        short año = teclado.nextShort();
        
        //Creamos un sout con la salida con todos los datos
        System.out.println("Hola " + nombre + ", naciste el " + dia + 
                "/" + mes + "/" + año);
        
    }
    
}
