package labs_examples.inheritance.labs;

// create controller class
public class Dnc {

    public static void main(String[] args) {

        // created debate() and candidate() methods in Warren
        // calling the methods() here
        Warren warren = new Warren("Democrat",8,"Senator",
                "MA",8,"Professor", "Bankruptcy");

        warren.career();
    }
}
