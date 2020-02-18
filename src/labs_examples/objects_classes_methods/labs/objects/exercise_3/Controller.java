package labs_examples.objects_classes_methods.labs.objects.exercise_3;

public class Controller {

    public static void main(String[] args) {

        // default constructor created if not specified by user
        // when creating objects, have parentheses to call constructor
        // create 3 objects
        POJO spain = new POJO("Madrid", "Spain", 46.66);
        POJO estonia = new POJO("Tallinn", "Estonia", 1.32);
        POJO thailand = new POJO("Bangkok", "Thailand", 69.04);

        // each object has instance variable
        // can describe object using variables
        spain.capital = "Madrid";
        spain.name = "Spain";
        spain.population = 46.66;

        // instance variables for estonia object
        estonia.capital = "Tallinn";
        estonia.name = "Estonia";
        estonia.population = 1.32;

        // instance variables for thailand object
        thailand.capital = "Bangkok";
        thailand.name = "Thailand";
        thailand.population = 69.04;

        System.out.println("The capital of " + spain.name + " is " + spain.capital
                + " and has a population of " + spain.population + " million.");

    }

}
