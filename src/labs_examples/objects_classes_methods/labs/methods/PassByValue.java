package labs_examples.objects_classes_methods.labs.methods;

public class PassByValue {

    public static void main(String[] args) {

        int x = 10; // declaring a primitive data type
        // stored in stack

        System.out.println("data = " + x);

        modify(x); // calling the modify() method
        System.out.println("data = " + x);
    }
    public static int modify(int data) {
        data = 20;
        // stored in stack
        // no impact on "x"
        System.out.println("data = " + data);
        return data;
    }
}

// the variables x = 10, x = 20, data = 20
// data = 20 has no impact on "x"

