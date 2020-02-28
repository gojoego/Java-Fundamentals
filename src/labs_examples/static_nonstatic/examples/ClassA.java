package labs_examples.static_nonstatic.examples;

/**
 * Created by ryandesmond - https://codingnomads.co
 */

// will have main method
// 4 methods
    // 2 static
    // 2 non static


public class ClassA {

    public static void main(String[] args) {

        // SAME CLASS ----------------------------- SAME CLASS
        // calling static method in same class
        // can directly call
        staticMethod();

        // static method
        // when calling method with return type such as int or double,
        // primitive or object, be sure to assign to variable of same type
        int ex = multiply(23,56);
        System.out.println(ex);

        // non static method in SAME CLASS
        // non static means work at object level
        // methods used to get those instance variables are non static
        // calling non-static methods in same class (create an object first)
        ClassA thisClass = new ClassA();
        thisClass.nonStaticMethod1();
        int x = thisClass.nonStaticReturnMethod(2,3);



        // DIFFERENT CLASSES ----------------------------- DIFFERENT CLASSES
        // calling a static method in another class (use the class name)
        ClassB.staticMethod();

        // calling a non-static method in another class (use an object)
        ClassB thatClass = new ClassB();
        thatClass.nonStaticMethod();

    }

    public static void staticMethod(){
        System.out.println("ClassA staticMethod printing");
    }

    public void nonStaticMethod1(){
        System.out.println("ClassA nonStaticMethod1 printing");

    }

    public static int multiply(int a, int b){return a * b;}

    public double multiply(double a, double b){return a * b;}

    public int nonStaticReturnMethod(int a, int b){
        System.out.println("ClassA nonStaticReturnMethod printing");
        return a * b;
    }

}
