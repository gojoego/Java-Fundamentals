package labs_examples.fundamentals.labs;

// This program has variables of several of the integer types

public class integers {
    public static void main(String[] args) {
        int checking; // Declare an int variable named checking.
        byte miles; // Declare a byte variable named miles.
        short minutes; // Declare a short variable named minutes.
        long days; // Declare a long variable named days.

        checking = -20; // Here I am setting the int variable "checking" to -20.
                        // I had previously declared the int variable for checking above.
        miles = 105; // setting miles int variable to 105 (int)
        minutes = 120; // setting minutes int variable to 120 (int)
        days = 189000; // setting day int variable value to 189000, which is an int

        System.out.println("We have made a journey of " + miles + " miles.");
        System.out.println("It took us " + minutes + " minutes.");
        System.out.println("Our account balance is $" + checking);
        System.out.println("About " + days + " days ago Columbus " +
                "stood on this spot.");
    }
}