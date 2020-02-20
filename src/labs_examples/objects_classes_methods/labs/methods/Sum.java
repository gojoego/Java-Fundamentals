package labs_examples.objects_classes_methods.labs.methods;

public class Sum {

    // method overloading
    // creating a method that takes ints and doubles
    // and adds them together to get the sum

    public static int sum(int a, int b, int c){
        return (a + b + c);
    }

    public static double sum(double a, double b, double c){
        return (a + b + c);
    }
    public static double sum(int a, double b){
        return a + b;
    }
    public static int sum(int a, int b){
        return a + b;
    }

}
