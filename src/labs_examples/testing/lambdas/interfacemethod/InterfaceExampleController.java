package labs_examples.testing.lambdas.interfacemethod;

// goal is to use the ExampleInterface

public class InterfaceExampleController {

    public static void main(String[] args) {


        // traditional way
        // 1: create a class that implements ExampleInterface
        // 2: create an object of that class
        // 3: declare variable for result of method to be set to
        long start1 = System.currentTimeMillis();
        InterfaceImpl obj = new InterfaceImpl();
        int result = obj.calculate(3,4);
        long end1 = System.currentTimeMillis();
        System.out.println("Interface took " + (end1-start1) + " milliseconds = " + result);



        // anonymous inner class
        // instead of making object from class , make object of interface
        // as created, required to implement method right away
        ExampleInterface obj2 = new ExampleInterface() {

            @Override
            public int calculate(int a, int b) {
                return (a*2) + (b*2);
            }
        };

        long start2 = System.currentTimeMillis();
        int result2 = obj2.calculate(3,6);
        long end2 = System.currentTimeMillis();
        System.out.println("Interface took " + (end2-start2) + " milliseconds = " + result2);

        // lambda expression
        // requires functional interface
        // which only 1 abstract method
        // create object of interface using lambda expression
        ExampleInterface obj3 = (int x, int y) -> {
            return (x * 2) + (y * 2);
        };
        int result3 = obj.calculate(5,5);
        long end3 = System.currentTimeMillis();
        long start3  = System.currentTimeMillis();
        System.out.println("Interface took " + (end3-start3) + " milliseconds = " + result3);
    }

}
