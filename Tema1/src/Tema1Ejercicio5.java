public class Tema1Ejercicio5 {
    public static void main(String[] args) throws Exception {
        
        int result_int ;

        double result_double;

        boolean result_bolean;

        result_int = 24 % 5;
        System.out.println("1 Act. 24 % 5 = " + result_int);

        result_double = 7 / 2 + 2.5 ;
        System.out.println("2 Act. 7 / 2 + 2.5 = " + result_double);

        result_double = 10.8 / 2 + 2;
        System.out.println("3 Act. 10.8 / 2 + 2 = " + result_double);

        result_int = ( 4 + 6 ) * 3 + 2 * ( 5 - 1 );
        System.out.println("4 Act. ( 4 + 6 ) * 3 + 2 * ( 5 - 1 ) = " + result_int);

        result_int = 5 / 2 + 17 % 3;
        System.out.println("5 Act. 5 / 2 + 17 % 3 = " + result_int);

        result_bolean = 7 >= 5 || 27 != 8;
        System.out.println("6 Act. 7 >= 5 OR 27 <> 8 = " + result_bolean);

        result_bolean = (45 <= 7) || !( 5 >= 7 );
        System.out.println("7 Act. (45 <= 7) OR NOT ( 5 >= 7 ) = " + result_bolean);

        result_int = 27 % 4 + 15 / 4;
        System.out.println("8 Act. 27 % 4 + 15 / 4 = " + result_int);

        result_int = 37 / 4 * 4 - 2;
        System.out.println("9 Act. 37 / 4 * 4 - 2 = " + result_int);

        result_bolean = (25 >= 7) && !(7 <= 2);
        System.out.println("10 Act. (25 >= 7) AND NOT (7 <=2) = " + result_bolean);

        result_bolean = ('H' < 'J') && ('9' != '7');
        System.out.println("11 Act. ('H' < 'J') AND ('9' <> '7') = " + result_bolean);

        result_bolean = 25 > 20 && 13 > 5;
        System.out.println("12 Act. 25 > 20 AND 13 > 5 = " + result_bolean);

        result_bolean = 10 + 4 < 15 - 3 || 2 * 5 + 1 > 14 - 2 * 2;
        System.out.println("13 Act. 10 + 4 < 15 - 3 OR 2 * 5 + 1 > 14 - 2 * 2 = " + result_bolean);

        result_bolean = 4 * 2 <= 8 || 2 * 2 < 5 && 4 > 3 + 1;
        System.out.println("14 Act. 4 * 2 <= 8 OR 2 * 2 < 5 AND 4 > 3 + 1 = " + result_bolean); 

        result_bolean = 10 <= 2 * 5 && 3 < 4 || !(8>7) && 3 * 2 <= 4 * 2 - 1;
        System.out.println("15 Act. 10 <= 2 * 5 AND 3 < 4 OR NOT (8>7) AND 3 * 2 <= 4 * 2 - 1 = " + result_bolean);



    }
}
