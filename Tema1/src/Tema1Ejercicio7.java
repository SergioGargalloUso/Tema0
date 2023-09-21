import java.util.Scanner;

    public class Tema1Ejercicio7 {
        public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce un valor de la cara de un dado de 6 lados");

        int dice = in.nextInt();

        if( dice > 0 && dice < 7){
            int reverse;

            reverse = 7 - dice;

            System.out.println("La cara del dado que me has dado es " + dice + " su reverso es  = " + reverse );

        }else{

            System.out.println("No has introducido un valor de un dado de 6 caras");

        }  

    }
}
