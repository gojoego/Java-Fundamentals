package labs_examples.inheritance.labs;

/*
The "super" keyword is just like the "this" keyword.
However, instead of referring to a variable or method in the
current class using "this", "super" refers to a variable or
method in a parent class.

If your method overrides one of its superclass's methods,
you can still invoke the overridden method in the parent class
through the use of the keyword "super".
 */

public class SuperExample {

}

// parent class aka super class
class Superclass {
    public void printMethod() {
        System.out.println("Printed in Superclass.");
    }
}


class Subclass extends Superclass {
    // overrides printMethod in Superclass
    @Override
    public void printMethod() {
        System.out.println("Printed in Subclass");
    }
    public void someMethod(){
        // invoke the printMethod() in the "super" class
        super.printMethod();
        // invoke the printMethod() in "this" class
        this.printMethod();
    }
}

class Vehicle1 {
    int mpg;
    int fuel_capacity;
    String type;
    // custom constructor replaces (empty) default constructor - to create a Vehicle object you
    // must use this custom constructor and pass the required arguments
    public Vehicle1(int mpg, int fuel_capacity, String type) {
        this.mpg = mpg;
        this.fuel_capacity = fuel_capacity;
        this.type = type;
    }
}

class Example {
    public static void main(String[] args){
        Subclass obj = new Subclass();
        obj.someMethod();
        Vehicle1 vehicle = new Vehicle1(25, 16, "Nissan XTerra");
    }
}

/*
Notice that within someMethod() that the super
printMethod() is called, then the child printMethod()
is called. If we were to call obj.printMethod() it
would automatically invoked the printMethod() in the
child class. But within the child class we can refer
to the printMethod() in the super class using "super"
and to the printMethod() in the child class using "this".
 */