package relacionDeEjercicios;

import java.util.Scanner;//para importar la clase Scanner y mi clase teclado la conozca
//el paquete java.lang no se importa nunca porque lo conoce por defecto
public class Teclado {
    public static void main(String[] args) {
        // Para leer por teclado estandar usamos
        //la clase Scanner
        Scanner teclado;
        String miNombre;
        
        //Constryo el objeto Scanner con su contructor
        //pasando como parametro el flujo de entrada estandar
        //entrada estandar es el System.in
        //Todos los contructores necesitan palbra reservada
        //new para poder reservar memoria
        teclado = new Scanner(System.in);
        
        //Se guarda en la variable
        //el resultado de introducir caracteres por teclado
        //hasta que se pulda el Enter
        System.out.println("Introduce tu nombre: ");
        miNombre = teclado.nextLine();
        System.out.println("Has puesto: " + "\n" + miNombre);
    }
    
}
