package relacionDeEjercicios;
public class Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                //esto son variables de numero enteros
        int entero = 32;            //32 bits
        short corto = 16;           //16bits
        long largo = 64;            //utiliza 64bits
        
        //Esto son variables de numeros reales(deciomales)
        //Son lo mismo la unica diferencia son el num 
        //de decimales que muestran
        float flotante = 3.14f;   //32bits
        double doble = Math.PI;     //64bits
        
        //char es una variable para solo caracter unicode
        char caracter = 'j';
        
        //variable para texto
        String texto = "Prueba de texto";
        System.out.print("Los tipos de variables enteras son: ");
        System.out.print("Int que da un resultado: " + entero);
        System.out.print("Short que da un resultado: " + corto);
        System.out.print("Long que da un resultado: " + largo);
        System.out.print("Los tipos de variable con decimales son: ");
        System.out.print("float es de tipo: " + flotante);
        System.out.print("double que da un resultado: " + doble);
        System.out.print("El tipo de variable de caracteres es: ");
        System.out.print("char que da un resultado: " + caracter);   
    
    }
    
}
