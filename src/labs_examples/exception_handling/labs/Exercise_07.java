package labs_examples.exception_handling.labs;

import java.util.ArrayList;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

class NotAValidColorException extends Exception{

    String color;

    public NotAValidColorException(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        // jvm will call method
        return color + " is not a valid color";
    }
}

class CustomExceptionDemo {
    public static void main(String[] args) {

        try {
            paint("Blue");
        } catch (NotAValidColorException e) {
            System.out.println(e.toString());
        }
        try {
            paint("Red");
        } catch (NotAValidColorException e) {
            System.out.println(e.toString());
        }
        try {
            paint("Purple");
        } catch (NotAValidColorException e) {
            System.out.println(e.toString());
        }
        try {
            paint("Car");
        } catch (NotAValidColorException e) {
            System.out.println(e.toString());
        }


    }
    public static void paint(String color) throws NotAValidColorException {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        colors.add("Pink");

        if(!colors.contains(color)){
            throw new NotAValidColorException(color);
        }
        System.out.println("painting " + color);
    }
}