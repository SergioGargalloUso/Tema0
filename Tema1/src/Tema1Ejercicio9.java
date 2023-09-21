import java.util.Scanner;

    public class Tema1Ejercicio9 {
        public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce un valor entero");

        int a = in.nextInt();

        System.out.println("Introduce otro valor entero");

        int b = in.nextInt();

        int c;

        c=a+b;

        System.out.println("El valor " + a + " + " + b + " = " + c);

        c=a-b;

        System.out.println("El valor " + a + " - " + b + " = " + c);

        c=a*b;

        System.out.println("El valor " + a + " * " + b + " = " + c);

        c=a/b;

        System.out.println("El valor " + a + " / " + b + " = " + c);

        c=a%b;

        System.out.println("El valor " + a + " % " + b + " = " + c);


    }
}