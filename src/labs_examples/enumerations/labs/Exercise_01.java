package labs_examples.enumerations.labs;

import java.time.temporal.JulianFields;

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

        ClosestFriends justin = ClosestFriends.JUSTIN;
        ClosestFriends tiffany = ClosestFriends.TIFFANY;
        ClosestFriends dominique = ClosestFriends.DOMINIQUE;

        System.out.println("My best friend is " + justin +
                ". I have known him for " + justin.getYearsKnown() + ". We met in "
                + justin.getLocationMet() + ". We have traveled to " + justin.getCountriesTraveledWith()
                + " countries together.");

    }

}

enum ClosestFriends {
    JUSTIN(6,"San Francisco", 5),
    DOMINIQUE(5,"San Francisco", 8),
    TIMOTHY(10, "San Francisco",2),
    ALEXANDER(5,"San Francisco", 1),
    TIFFANY(14, "Davis",1),
    SARAH(13,"Davis", 1),
    MELANIE(15,"Davis",3);

    private int yearsKnown;
    private String locationMet;
    private int countriesTraveledWith;

    ClosestFriends(int yearsKnown, String locationMet, int countriesTraveledWith) {
        this.yearsKnown = yearsKnown;
        this.locationMet = locationMet;
        this.countriesTraveledWith = countriesTraveledWith;
    }

    public int getYearsKnown() {
        return yearsKnown;
    }

    public void setYearsKnown(int yearsKnown) {
        this.yearsKnown = yearsKnown;
    }

    public String getLocationMet() {
        return locationMet;
    }

    public void setLocationMet(String locationMet) {
        this.locationMet = locationMet;
    }

    public int getCountriesTraveledWith() {
        return countriesTraveledWith;
    }

    public void setCountriesTraveledWith(int countriesTraveledWith) {
        this.countriesTraveledWith = countriesTraveledWith;
    }
}


