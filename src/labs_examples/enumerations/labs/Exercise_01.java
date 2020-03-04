package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate
 *      the use of the enum from a separate class.
 *
 *      2) Create a parameterized enumeration that passes one or more values
 *      to it's constructor. Demonstrate the use
 *      of this enum from a separate class.
 */

public class Exercise_01 {

    public static void main(String[] args) {

        for(ClosestFriends bf : ClosestFriends.values()){
            System.out.println(bf);
        }
        System.out.println("One of my best friends");
    }

}

enum ClosestFriends {
    JUSTIN(6), DOMINIQUE(5),
    TIMOTHY(10), ALEXANDER(5), TIFFANY(14),
    SARAH(13), MELANIE(15);

    private int yearsKnown;

    ClosestFriends(int yearsKnown) {
        this.yearsKnown = yearsKnown;
    }

    public int getYearsKnown() {
        return yearsKnown;
    }

    public void setYearsKnown(int yearsKnown) {
        this.yearsKnown = yearsKnown;
    }
}


