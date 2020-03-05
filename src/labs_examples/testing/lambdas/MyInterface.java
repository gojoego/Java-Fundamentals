package labs_examples.testing.lambdas;

// lambdas

@FunctionalInterface
public interface MyInterface {

    public int calc(int a, int b);

}

class LambdaExamples {
    public static void main(String[] args) {

        MyInterface obj = (int a, int b) -> (a*2) * (b*2);

        int result = obj.calc(3,4);
        System.out.println(result);
    }


}
