package labs_examples.testing.lambdas.march5;

// check Functional Interfaces in rt > java > util > function

/*

1. write 5 unique Functional Interfaces (FI)
2. Create 2 unique Lambdas for each FI
3. Demonstrate usage of each Lambda

 */

import java.util.function.DoubleBinaryOperator;

public class LambdaControllerMarchFive {

    public static void main(String[] args) {


        FunIntOneInt oi1 = (int a) -> {return a*a*a;};
        int aa = oi1.use(9);
        System.out.println(aa);

        FunIntOneInt oi2 = (int a) -> {return a * 4;};
        int bb = oi2.use(73);
        System.out.println(bb);

        FunIntOneStr os1 = (String a) -> {
            return a.length();
        };
        int cc = os1.use("Massachusetts");
        System.out.println(cc);

        FunIntOneStr os2 = (String a) -> {
            return a.charAt(1);
        };

        int dd = os2.use("San Francisco");
        System.out.println(dd);

        FunIntOneStrOneInt si1 = (String name, int age) -> {
            System.out.println("My name is " + name + " and I am " +
                    age + " years old.");
        };
        si1.use("Joe",33);

        FunIntOneStrOneInt si2 = (String location, int duration) -> {
            System.out.println("I have been in " + location
                    + " for " + duration + " days.");
        };

        FunIntThreeInt ti1 = (int a, int b, int c) -> {
            return (a + b + c)/3;
        };
        int ee = ti1.use(34,23,59);
        System.out.println(ee);

        FunIntThreeInt ti2 = (int a, int b, int c) -> {
          return a * b * c;
        };
        int ff = ti2.use(3,9,10);
        System.out.println(ff);

        FunInt2Gen<Double,Double> td1 = (Double a, Double b) -> {
            System.out.println(a/b);
        };
        td1.use(3.4,5.5);

        FunInt2Gen<String,String> td2 = (String a, String b) -> {
            System.out.println(a + " " + b);
        };
        td2.use("Joseph","Gallego");

    }
}
