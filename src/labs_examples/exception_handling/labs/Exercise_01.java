package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

public class Exercise_01{

    public static void main(String[] args) {

        try {
            String[] bahasaGreetings = new String[7];
            bahasaGreetings[0] = "Selamat pagi"; // Good morning
            bahasaGreetings[1] = "Selamat siang"; // Good afternoon
            bahasaGreetings[2] = "Selamat sore"; // Good afternoon
            bahasaGreetings[3] = "Selamat malam"; // Good evening
            bahasaGreetings[4] = "Selamat tidur"; // lit. Good sleep or good night
            bahasaGreetings[5] = "Selamat tinggal"; // lit. Good leaving or goodbye
            bahasaGreetings[6] = "Selamat datang"; // lit. Good coming or welcome

            System.out.println(bahasaGreetings[7]);

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The index you tried to access does not exist.");
        }

        System.out.println("Selamat tinggal!!!");

    }
}
