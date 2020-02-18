package labs_examples.objects_classes_methods.labs.objects.exercise_3;

public class POJO {

    // class: blueprint for class

    // instance variables
    // this POJO will describe a country
    double population;
    double population1;
    double population2;
    String name;
    String capital;

    // constructors
    // syntax: accessModifier className(){}
    // parameterized constructor
    public POJO(String capital, String name, double population){
        this.capital = capital;
        this.name = name;
        this.population = population;
    }

    // another constructor
    public POJO(double population1, double population2){
        this.population1 = population1;
        this.population2 = population2;
    }

    // one more constructor
    public POJO(String name, String capital){
        this.name = name;
        this.capital = capital;
    }


}
