package labs_examples.objects_classes_methods.labs.objects.exercise_3;

public class Controller {

    public static void main(String[] args) {

        // default constructor created if not specified by user
        // when creating objects, have parentheses to call constructor
        // create 3 objects
        Country spain = new Country("Madrid", "Spain", 46.66);
        Country estonia = new Country(3.49, 1.32);
        Country thailand = new Country("Bangkok", "Thailand");

        // each object has instance variable
        // can describe object using variables
        // set extra parameters here


        // instance variables for estonia object
        estonia.capital = "Tallinn";
        estonia.name = "Estonia";
        estonia.population = 1.32;

        // instance variables for thailand object
        thailand.population_capital = 3.49;
        thailand.population_region = 1.32;

        System.out.println("The capital of " + spain.name + " is " + spain.capital
                + " and has a population of " + spain.population + " million.");

        System.out.println("The capital of " + thailand.name + " is " + thailand.capital
                + " and has a population of " + thailand.population + " million.");

        System.out.println("The capital of " + estonia.name + " is " + estonia.capital
                + " and has a population of " + estonia.population + " million.");

    }

}
