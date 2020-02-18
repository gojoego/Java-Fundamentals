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

    // constructors
    // syntax: accessModifier className(){}
    // parameterized constructor
    public Country(String capital, String name, double population){
        this.capital = capital;
        this.name = name;
        this.population = population;
    }

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


}
