package labs_examples.testing.lambdas.march5;

import java.util.function.BiFunction;

public class MethRefClass1 {

}
    class Multiplication{
        public static int multiply(int a, int b){
            return a*b;
        }
    }
    class StaticMethod {
        public static void main(String[] args) {
            // swapping a custom Lambda body with a reference to the multiply() method
            // in the Multiplication class
            BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;
            int pr = product.apply(11, 5);
            System.out.println("Product of given number is: "+pr);
        }
    }

