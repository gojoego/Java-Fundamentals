package labs_examples.testing.lambdas.interfacemethod;

public class InterfaceImpl implements ExampleInterface {


    @Override
    public int calculate(int a, int b) {
        return (a * 2) + (b * 2);
    }
}
