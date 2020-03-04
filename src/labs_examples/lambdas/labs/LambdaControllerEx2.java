package labs_examples.lambdas.labs;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class LambdaControllerEx2 {

    public static void main(String[] args) {

        //1

        BiConsumer<String,String> bc = (String b, String c) -> {
            System.out.println(b + c);
        };
        bc.accept("jos","eph");

        //2

        BiFunction <Integer, Integer, Integer> bf = (Integer one, Integer two) -> {
            return one + two;
        };

        double g = bf.apply(3,1);
        System.out.println(g);

        //3

        BinaryOperator<Integer> bo = (n1, n2) -> {
            return n1 + n2;
        };
        int v = bo.apply(6,79);
        System.out.println(v);

        //4
        BiPredicate<Integer,Integer> bp = (aa, bb) -> {
            return aa > 3 && bb < 10;
        };
        boolean cc = bp.test(4,2);
        System.out.println(cc);


    }

}
