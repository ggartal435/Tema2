package relacionDeEjercicios;

public class Ej08 {

    public static void main(String[] args) {
        /*
        a.- Declara e inicializa tres variables int (a=10,  b=5, i=0)
	b.- Declara e inicializa dos variables double (c=71.3 y d=4.8)
	c.- Realiza las siguiente operaciones aritméticas a+b, a-b, a*b, a/b, c+d, c-d, c*d, c/d.
            El resultado de cada operación se almacena en una nuevas variables que se crearán para tal efecto.
	d.- Muestra el resultado de cada operación, usando las variables creadas en el paso c).
	e.- También muestra en pantalla los resultados de las siguientes operaciones: a*=3, b-=1, a/=b, c+=d.
	f.- Finalmente, el programa muestra en consola la siguiente información, en distintas instrucciones: valor de i, valor de i++, valor de i y valor de ++i.
         */

        //Punto A:
        int a = 10, b = 5, i = 0;

        // Punto B:
        double c = 71.3, d = 4.8;

        //Punto C:
        int aMb = a + b, amb = a - b, apb = a * b, adb = a / b;
        double cMd = c + d, cmd = c - d, cpd = c * d, cdd = c / d;

        //Punto D
        System.out.println(
                "Los variables a, b , c y d tienen los siguientes valores respectivamente: " + a + ", " + b + ", " + c + ", y " + d + "\n"
                + "Si sumamos a y b nos da el siguiente resultado: " + aMb + "\n"
                + "Si restamos a y b nos da el siguiente resultado: " + amb + "\n"
                + "Si multiplicamos a y b nos da el siguiente resultado: " + apb + "\n"
                + "Si dividimos a y b nos da el siguiente resultado: " + adb + "\n"
                + "Si sumamos c y d nos da el siguiente resultado: " + cMd + "\n"
                + "Si restamos c y d nos da el siguiente resultado: " + cmd + "\n"
                + "Si multiplicamos c y d nos da el siguiente resultado: " + cpd + "\n"
                + "Si dividimos c y d nos da el siguiente resultado: " + cdd);

        //Punto E:
        System.out.println("a multiplicado por 3 es: " + (a *= 3) + "\n"
                + "b menos 1 es: " + (b -= 1) + "\n"
                + "a dividido b es: " + (a /= b) + "\n"
                + "c mas d es: " + (c += d) + "\n");

        //Punto F:
        System.out.println("El valor de i es de: " + i + "\n"
                + "El valor de i++ es de: " + i++ + "\n"
                + "El valor de i es de: " + i + "\n"
                + "El valor de ++i es de: " + ++i);
    }

}
