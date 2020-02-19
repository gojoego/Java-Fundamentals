package labs_examples.objects_classes_methods.labs.objects.exercise_3;

public class Controller {

    public static void main(String[] args) {

        // default constructor created if not specified by user
        // when creating objects, have parentheses to call constructor
        // create 3 objects
        Country spain = new Country("Madrid", "Spain", 46.66);
        // When creating an object, you must first state the class. This object is being created
        // from the Country class. Then, you name the object. We called this one "spain."
        // This new spain object created from the Country class is equal to new Person().
        // Each object has instance variables or attributes that are available to access or CALL.
        // For the Spain object we have created, we have set values for 3 variables.
        // The capital variable has been set to String Madrid, name to Spain and pop to 46.66 (parameters



        Country estonia = new Country(3.49, 1.32);
        // A constructor gets called with the second half of the equation: "new Country()


        Country thailand = new Country("Bangkok", "Thailand");
        // To create an object, you input the name of the class. Then we give that object a name.
        // That equals to "new" and the name of the class plus the parameters that the
        // constructors require. Once we have created the object, we can then access
        // the attributes if we have set them by using objectName.variableName.



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
