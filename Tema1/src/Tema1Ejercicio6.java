import java.util.Scanner;

    public class Tema1Ejercicio6  {
        public static void main(String[] args) {
        
            Scanner in = new Scanner(System.in);

            System.out.println("Introduce un valor");

            int r = in.nextInt();

            double a;

            a = 3.14 * r * r;

            System.out.println("De un circulo cuyo radio es " + r + " el area es = " + a );

        }

    }
