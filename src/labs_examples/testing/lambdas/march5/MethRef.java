package labs_examples.testing.lambdas.march5;

/*

Utilize online learning platform and google
to demonstrate examples of:

Static Method Reference
Instance Method Reference
Arbitrary Method Reference
Constructor Reference

NOTE:   a method reference is the body of a lambda expression, which is the body of an
        abstract FI method) but the body we want to sue already exists somewhere else,
        so instead of duplicating that logic, we just refer the lambda expression to us
        the body of the existing method, hence "method" -> "reference." It is a shortcut
        for lambdas.

 */


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.function.BiFunction;

// static method reference example:

public class MethRef {

    public static void main(String[] args) {

        // lambda expression
        BiFunction<Integer,Integer,Integer> bf1 = (Integer a, Integer b) -> {
            return a + b;
        };
        int j = bf1.apply(7,8);
        System.out.println(j);


        BiFunction<Integer,Integer,Integer> bf2 = Integer::sum;
        int k = bf2.apply(7,8);
        System.out.println(k);


    }






}
