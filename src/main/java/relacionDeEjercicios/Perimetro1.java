package relacionDeEjercicios;
/**
 *
 *commentario JavaDoc 
 * @author gabriel
 */
//Aqui estarian los import
// Con doble barra se hacen comentarios de linea
/*
    Con barra asterisco se hacen los comentario de varias lineas
*/
//Declaracion de la clase
public class Perimetro1 {
    /*El metodo main es el que busca
    el JRE para iniciar la ejecucion*/
    public static void main(String[] args) {
        //Esta es la instruccion basica para imprimir por consola
        System.out.println("Programa para calcular el perimetro"
                + " de una circunferencia");
        //perimetro=2*PI*R
        /*Declaracion e inicializaion(tiene un valor) de una 
        variable de tipo int con un valor de 23*/
        int radio = 20;
        double pi;
        pi =  3.14;
        
        System.out.println("El radio vale: " + radio);
        double perimetro = 2 * pi * radio;
        
        System.out.println("El perimetro es: " + perimetro);
    }
}
