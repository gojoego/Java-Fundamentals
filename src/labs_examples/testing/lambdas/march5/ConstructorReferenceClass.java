package labs_examples.testing.lambdas.march5;

import java.util.Locale;
import java.util.function.BiFunction;

public class ConstructorReferenceClass {

    public static void main(String[] args) {

        // using a lambda expression
        BiFunction<String, String, Locale> f1 = (lang, country) ->
                new Locale(lang, country);
                Locale loc1 = f1.apply("en", "UK");

        BiFunction<String, String, Locale> f2 = Locale::new;
                Locale loc2 = f2.apply("en", "UK");


    }

}
