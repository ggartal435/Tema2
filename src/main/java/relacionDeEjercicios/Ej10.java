package relacionDeEjercicios;

public class Ej10 {

    public static void main(String[] args) {
//      a.- Declara e inicializa dos variables lógicas, una se llamará verdadero y valdrá true, la otra falso y valdrá false.
//	b.- Muestra las tablas de verdad de las operaciones lógicas && (AND) y || (OR), usando las variables verdadero y falso.
//	c.- Muestra en pantalla el resultado de las operaciones !verdadero y !falso.

        //Punto A
        boolean verdadero=true, falso=false;
        
        //Punto B
        boolean y = verdadero && falso;
        boolean o = verdadero || falso;
        
        //Punto C
        System.out.println("Si verdadero Y falso son verdaderos: " + y + "\n"
                          +" Si verdero O falso son verdaderos: " + o);
    }
    
}
