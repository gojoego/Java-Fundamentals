package videos_source_code.oop.encapsulation.animals;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
// the class is the root of all encapsulation
// encapsulation: all data and methods that act on data are encapsulated in class
// class is root of all encapsulation
// the Dog class can't affect/access the City class and vice versa
public class Dog {

    // access modifiers are the next level of encapsulation
    // can encapsulate data using private access modifiers for the variables
    // private variables useful in encapsulation
    // all variables should be private unless you need to
    // that protects other classes from having the ability to change variables
    private String breed;
    private String name;
    private int age;

    public String getBreed() {
        return breed;
    }
    // if someone needs access to the private variables,
    // they have to call one of the public methods
    // within public methods can do data auth, validation, etc

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// packages in encapsulation
// packages are folders with related code
// e.g. no way that Dog class can negatively impacted City class and vice versa
// all data and methods in class, use access modifiers to restrict access