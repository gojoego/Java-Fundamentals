package labs_examples.testing.lambdas.march5;

import java.util.function.Function;

public class ArbitraryMethRefClass2 {

    public static void main(String[] args) {

        // This is an arbitrary method reference
        Function<String, String> obj = String::toLowerCase;
        System.out.println(obj.apply("HELLO :)"));

        // This is functionally equivolent, just uses a Lambda expression
        Function<String, String> obj2 = (String s) -> {
            return s.toLowerCase();
        };
        System.out.println(obj2.apply("HELLO :)"));
    }

}
