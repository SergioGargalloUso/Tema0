import java.util.Scanner;

    public class Tema1Ejercicio10 {
        public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce un valor entero");

        double a = in.nextDouble();

        System.out.println("Introduce otro valor entero");

        double b = in.nextDouble();

        double c;

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
