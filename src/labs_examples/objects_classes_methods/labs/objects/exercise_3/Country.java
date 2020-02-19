package labs_examples.objects_classes_methods.labs.objects.exercise_3;

public class Country {

    // class: blueprint for class
    // instance variables
    // this POJO will describe a country
    // represents an object
    double population;
    double population_capital;
    double population_region;
    String name;
    String capital;

    public Country(){}
    // default constructor


    // constructors
    // syntax: accessModifier className(attributes, arguments, parameters){}
    // parameterized constructor
    public Country(String capital, String name, double population){
        // public access modifier available everywhere
        // private access modifier not available outside of this class
        // This Country constructor will take parameters of
        // String capital, String name, and double population
        // It is considered a parameterized constructor

        this.capital = capital;
        // The "this" keyword associates this capital value to the instance variable capital

        this.name = name;
        this.population = population;
        // The constructor will take the parameters and set
        // the instance variables in this class of the same name to those values
    }
    // constructors follow this default format if not created: public constructorName(){}
    // constructors do NOT have a return type
    // constructor is a method that gets called when "new" keyword is used
    // all POJOs have constructors and will be used as a shortcut for creating objects
    // When you create an object, you'll PASS in attributes of that object.



    // another constructor
    public Country(double population_capital, double population_region){
        this.population_capital = population_capital;
        this.population_region = population_region;
    }

    // one more constructor
    public Country(String name, String capital){
        this.name = name;
        this.capital = capital;
    }
    // overloading constructors: same name but different parameters


}
