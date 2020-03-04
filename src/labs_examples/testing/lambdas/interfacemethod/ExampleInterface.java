package labs_examples.testing.lambdas.interfacemethod;

@FunctionalInterface
// indicates that we will not have more than abstract method
public interface ExampleInterface {

    public int calculate(int a, int b);

}
