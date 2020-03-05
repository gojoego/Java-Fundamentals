package labs_examples.testing.lambdas;

// lambdas

import labs_examples.testing.lambdas.march5.FunIntOneInt;

import java.util.function.Function;
import java.util.function.LongConsumer;

@FunctionalInterface
public interface MyInterface {

    public int calc(int a, int b);

}

class LambdaExamples {
    public static void main(String[] args) {

        MyInterface obj = (int a, int b) -> (a*2) * (b*2);

        int result = obj.calc(3,4);
        System.out.println(result);

        Function<Integer,Integer> f = (Integer i) -> {
            return i * i;
        };

        int a = f.apply(12);
        System.out.println(a);

        LongConsumer obj3 = (long l) -> {
            System.out.println(l);
        };

        obj3.accept(23049);

    }
}
