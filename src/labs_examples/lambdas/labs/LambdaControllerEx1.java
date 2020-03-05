package labs_examples.lambdas.labs;


import java.util.function.DoubleBinaryOperator;
import java.util.function.IntPredicate;

public class LambdaControllerEx1 {

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

        DoubleBinaryOperator db = (double q, double w) -> {
            return q/w;
        };

        double z = db.applyAsDouble(4,5);
        System.out.println(z);

        IntPredicate ip = (int aa) ->{
            if (aa == 10){
                return true;
            } else{
                return false;
            }
        };

        boolean bb = ip.test(19);
        System.out.println(bb);


    }

}
