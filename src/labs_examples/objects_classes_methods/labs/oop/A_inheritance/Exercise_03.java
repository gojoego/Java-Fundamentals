package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Why does the output print in the order it does?
 *
 * You answer: even the object was created in class C_1, it extends back to B_1, which extends to A_1,
 * so code will be ran starting with the highest parent
 *
 */

class A_1 {
    public A_1()
    {
        System.out.println("Class A Constructor");
    }
}

class B_1 extends A_1 {
    public B_1()
    {
        System.out.println("Class B Constructor");
    }
}

class C_1 extends B_1 {
    public C_1()
    {
        System.out.println("Class C Constructor");
    }
}

public class Exercise_03 {
    public static void main(String[] args)
    {
        C_1 c = new C_1();
    }
    // creating object c of the C_1 class
    // since there is no parameters
}
