package relacionDeEjercicios;

public class Ej07 {

    public static void main(String[] args) {
        //Aqui definimos las variables enteras y reales
        int a = 1, b = 2, c = 3, enteros;
        double d = 4.5, e = 5.7, f = 6.7, reales;

        //Aqui mostramos ambas lineas con los tipos de datos
        System.out.println("Aqui estan los numeros enteros: " + a + " " + b + " " + c);
        System.out.println("Aqui estan los numeros decimales: " + d + " " + e + " " + f);

        //aqui hacemos el intercambio de valores
        enteros = b;
        b = c;
        c = a;
        a = enteros;
        System.out.println("Aqui estan los enteros intercambiados: " + a + " " + b + " " + c);
        reales = e;
        e = f;
        f = d;
        d = reales;
        System.out.println("Aqui estan los decimales intercambiados: " + d + " " + e + " " + f);

    }

}
