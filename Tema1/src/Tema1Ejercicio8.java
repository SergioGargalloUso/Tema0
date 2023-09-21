import java.util.Scanner;

    public class Tema1Ejercicio8 {
        public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce un valor entero");

        int a = in.nextInt();

        System.out.println("Introduce otro valor entero");

        int b = in.nextInt();



        if( a > b ){
            
            System.out.println("El valor 33" + a + " es mayo que" + b );

        }else if (a < b) {
            
            System.out.println("El valor " + b + " es mayo que" + a );

        } else {
            
            System.out.println("El valor " + a + " y " + b + " son iguales" );

        }

    }
}