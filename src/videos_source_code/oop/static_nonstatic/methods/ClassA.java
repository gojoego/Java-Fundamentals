package videos_source_code.oop.static_nonstatic.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class ClassA {

    public static void main(String[] args) {

        // calling static methods in the same class
        // same class, static method in main method
        // can just print name
        staticMethod();
        int x = multiply(23, 56);
        // always be sure to capture value returned by method
        // by setting value equal to a variable
        // you won't get an error if you don't do it
        // assign to variable of same type
        System.out.println(x);


        // calling non-static methods in the same class
        // non-static methods work at object level
        // methods used to get instance variables are non-static
        // only way to access non-static method is by creating and using an object
        // can only be called from an object context
        ClassA obj = new ClassA();
        obj.nonStaticMethod();
        double y = obj.multiply(12.34, 67.89);
        System.out.println(y);
        obj.nonStatic1();

        // calling static methods in another class
        // use Class name then name of method
        // dot notation
        ClassB.staticMethod();

        // calling a non-static method in another class
        // use object
        // also use dot notation
        ClassB obj2 = new ClassB();
        obj2.nonStaticMethod();

    }

    public static void staticMethod(){
        System.out.println("printing staticMethod");
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public void nonStaticMethod(){
        System.out.println("printing nonStaticMethod");
    }


    public double multiply(double a, double b){
        return a * b;
    }

    public void nonStatic1(){
        nonStatic2();
    }
    // calls other method within same class

    public void nonStatic2(){
        System.out.println("printing non-static 2");
    }
    
}

// non static methods and variables only work on actual object
// static methods and variables work at the class level
// static lives outside the realm of objects
