package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

public class Exercise_03 {

    public static void main(String args[]){

        int a = 6;
        int b = 3;

        try{

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

        finally {
            System.out.println("Selamat tinggal");
        }

    }
}