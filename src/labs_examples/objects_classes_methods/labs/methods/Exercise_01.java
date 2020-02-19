package labs_examples.objects_classes_methods.labs.methods;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // public: access modifier
        // static: whether or not it works on objects
        // void: does not return value
        // main: name (other methods can be named whatever you want)
        // inside parentheses are method parameters or arguments
        // args is what you pass into java app
        // method is a block of code within curly brackets
        // main method is where every application begins by default
        // types only need to be defined once
        // return value must match variable type
        // in same class, no need to call
        // if not static can no longer call, would need to create object
        // hold command key and hover over method will take you directly to method

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()

        int a = 32;
        int b = 4;

        // variable type needs to match
        int product = multiply(a, b);
        System.out.println("product: " + product);

        int quotient = divide(a, b);
        System.out.println("quotient: " + quotient);

        joke();

        int years = 33;
        int seconds = yearsSeconds(years);
        System.out.println("There are " + seconds + " in " + years + " years.");

        arrayLength("San Francisco", "Los Angeles", "New Orleans");

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b

    public static int multiply(int a, int b){
        return a * b;
    }
    // This class has a public access modifier, which means that the class is visible to all classes in any location.
    // It is a static method that returns an integer or "int" data type. The name of the method is "multiply."
    // The method parameters or arguments are "int a" and "int b." The actual method, which lies between the two curly brackets,
    // return the product of "int a" and "int b"

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b

    public static int divide(int a, int b){
        return a/b;
    }
    // This class has a public access modifier, is static, and returns an int value. The method has been named "divide."
    // The method parameters are "int a" and "int b" and the method returns the quotient of "a" and "b."

    // 3) Create a static void method that will print of joke of your choice to the console

    public static void joke(){
        System.out.println("JOKE: Our current president is the biggest joke of all time. Period.");
    }
    // This method is named "joke" and has a public access modifier, is static and has a void return type.
    // There are no parameters and the method body contains code that simply prints out a joke I
    // have inserted to be printed out.

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents

    public static int yearsSeconds(int years){
        return 31536000 * years;
    }
    // The method "yearsSeconds" is public, static and returns an int value. The parameter is an int value called years.
    // The method body contains code that multiples the int parameter by 3153600, which is the number of seconds in one year.

    // 5) Create a varargs method that will return the length of the varargs array passed in


    public static void arrayLength (String...args){

        for (String word: args){
            System.out.println(word.length());
        }

    }

    }

    // overloading method leading toward redundancy
    // variable length arguments or var args: useful if not sure how many inputs
    // or how many arguments are needed
    // must always be last argument









