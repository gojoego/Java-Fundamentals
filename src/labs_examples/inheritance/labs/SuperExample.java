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

/*
Notice that within someMethod() that the super printMethod() is called,
then the child printMethod() is called. If we were to call
obj.printMethod() it would automatically invoked the printMethod()
in the child class. But within the child class we can refer to the
printMethod() in the super class using "super" and to the printMethod()
in the child class using "this".
 */


/*
An important consideration, as mentioned earlier, when working with
inheritance, "super()" refers to the parent constructor(s).
As we remember, if you do not provide a constructor to a class
 Java will automatically provide a default constructor for you.
 However, if you provide one or more custom constructors in your
 parent class you must manually invoke the proper constructor.
 For instance:
 */

class Vehicle1 {
    int mpg;
    int fuel_capacity;
    String type;
    // custom constructor replaces (empty) default constructor -
    // to create a Vehicle object you
    // must use this custom constructor and pass the required arguments
    public Vehicle1(int mpg, int fuel_capacity, String type) {
        this.mpg = mpg;
        this.fuel_capacity = fuel_capacity;
        this.type = type;
    }
}

// child class
class Motorcycle1 extends Vehicle1 {

    int cubicLiters;
    // MotorCycle constructor
    Motorcycle1(int cubicLiters, int mpg, int fuel_capacity, String type){
        // call parent constructor first - always first - and pass required parameters
        super(mpg, fuel_capacity, type);
        // set local variables
        this.cubicLiters = cubicLiters;
    }
}
/*
Even if your child class does not require a custom constructor,
if the parent class has a custom constructor you must create a constructor
in the child class that calls the super constructor. For instance:
 */
class Motorcycle2 extends Vehicle1 {
    // no instance variables
    // all these parameters are passed directly to the constructor in the super (Vehicle) class
    Motorcycle2(int mpg, int fuel_capacity, String type){
        // call parent constructor first - always first
        super(mpg, fuel_capacity, type);
        // no local variables to set
    }
}

class Example {
    public static void main(String[] args){
        Subclass obj = new Subclass();
        obj.someMethod();
        Vehicle1 vehicle = new Vehicle1(25, 16, "Nissan XTerra");


        // Here we must use the custom constructor provided in the Motorcycle class,
        // which calls "super" on the Vehicle class
        Motorcycle1 bike1 = new Motorcycle1(2000, 25, 16, "Ducati Monster");

        Motorcycle2 bike2 = new Motorcycle2(25, 16, "Ducati Monster");
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


/*
If you would like to declare a variable that should not be
changed, for instance the number Pi,
mark it with final to prevent anyone from changing it.
 */

class FinalExample {
    // it is not possible to modify a final variable
    // ALL CAPS LOCKS for final variable names is common and accepted convention in Java
    public final double PI = 3.1415926535897932384626433832;

    public double getCircumference(double radius) {
        return ( 2 * PI * radius);
    }
}

/*

Final Methods Prevent Overriding
If a method is marked as final it prevents any and all subclasses
from overriding that method. For instance:

 */

class Vehicle2 {
    int mpg;
    int fuel_capacity;
    String type;

    // this method cannot be overridden as it is declared "final"
    public final void start(){
        // do steps to start Vehicle
    }
}

class Motorcycle3 extends Vehicle2 {
    int cubicLiters;
    Motorcycle3(int cubicLiters){
        mpg = 30;
        fuel_capacity = 10;
        type = "Motorcycle";
        this.cubicLiters = cubicLiters;
    }

//    // THIS IS ILLEGAL - you cannot override a final method in a parent class
//    @Override
//    public final void start(){
//
//    }
}