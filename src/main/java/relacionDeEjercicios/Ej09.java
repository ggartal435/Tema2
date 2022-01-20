package relacionDeEjercicios;
public class Ej09 {

    public static void main(String[] args) {
        //a.- Declara e inicializa dos variables int (a=10,  b=20).
        //b.- Declara cuatro variables booleanas.
        //c.- Guarda, en las variables booleanas, el resultado de realizar las siguientes operaciones relacionales: a<b, a>b, a==b, a!=b.
        //d.- Muestra en pantalla el resultado de las operaciones, usando las variables booleanas.

        //a.- Declara e inicializa dos variables int (a=10,  b=20).
        int a = 10, b = 20;

        //b.- Declara cuatro variables booleanas.
        //c.- Guarda, en las variables booleanas, el resultado de realizar las siguientes operaciones relacionales: a<b, a>b, a==b, a!=b.
        boolean aMenorb = a < b, aMayorb = a > b, aIgualb = a == b, aDifb = a != b;

        System.out.println("Vamos a confirmar/negar las siguientes afirmaciones: " + "\n"
                + a + " menor " + b + ": " + aMenorb + "\n"
                + a + " mayor " + b + ": " + aMayorb + "\n"
                + a + " igual " + b + ": " + aIgualb + "\n"
                + a + " diferente " + b + ": " + aDifb);
        

    }
    
}
