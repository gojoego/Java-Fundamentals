package labs_examples.lambdas.labs;


public class LambdaController {

    public static void main(String[] args) {

        FunctionalSum obj3 = (int x, int y) -> {
            return (x * 2) + (y * 2);

        };

        int x = obj3.sum(2,3);
        System.out.println(x);

        FunctionalReturn fr = (int m) -> {
            return m*m;
        };

        int y = fr.funcReturn(4);
        System.out.println(y);

        FunctionalDivide fd = (double i, double j) -> {
            return i/j;
        };

        double f = fd.divide(4,5);
        System.out.println(f);

    }

}
