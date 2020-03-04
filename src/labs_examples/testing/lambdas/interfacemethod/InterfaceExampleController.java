package labs_examples.testing.lambdas.interfacemethod;

public class InterfaceExampleController {

    public static void main(String[] args) {

        long start1 = System.currentTimeMillis();
        // traditional way
        InterfaceImpl obj = new InterfaceImpl();
        int result = obj.calculate(3,6);
        long end1 = System.currentTimeMillis();
        System.out.println("Interface took ");


        long start2 = System.currentTimeMillis();

        // anonymous inner class
        ExampleInterface obj2 = new ExampleInterface() {

            @Override
            public int calculate(int a, int b) {
                return (a*2) + (b*2);
            }
        };

        int result2 = obj2.calculate(3,6);
        long end2 = System.currentTimeMillis();
        System.out.println(result2);

        ExampleInterface obj3;

    }

}
