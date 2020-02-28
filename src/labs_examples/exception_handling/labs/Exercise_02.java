package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

public class Exercise_02 {

    public static void main(String args[]){
        try{

            int a;
            int b;
            a = 7;
            b = 0;

            int quotient = a / b;
            System.out.println(quotient);

            String[] bahasaGreetings = new String[7];
            bahasaGreetings[0] = "Selamat pagi"; // Good morning
            bahasaGreetings[1] = "Selamat siang"; // Good afternoon
            bahasaGreetings[2] = "Selamat sore"; // Good afternoon
            bahasaGreetings[3] = "Selamat malam"; // Good evening
            bahasaGreetings[4] = "Selamat tidur"; // lit. Good sleep or good night
            bahasaGreetings[5] = "Selamat tinggal"; // lit. Good leaving or goodbye
            bahasaGreetings[6] = "Selamat datang"; // lit. Good coming or welcome

            System.out.println(bahasaGreetings[a]);
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by 0");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index does not exist");
        }
        System.out.println("Selamat tinggal");
    }
}


