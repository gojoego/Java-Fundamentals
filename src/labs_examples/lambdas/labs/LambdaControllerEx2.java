package labs_examples.lambdas.labs;

import java.util.function.*;

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

        //5
        BooleanSupplier bs = () -> {
            return true;
        };

        int gg = 8, hh = 7;
        bs = () -> gg > hh;
        boolean dd = bs.getAsBoolean();
        System.out.println(dd);

        //6
        Consumer<String> co = (x) -> {
            System.out.println(x.toUpperCase());
        };
        co.accept("i love ubud.");

        //7
        Predicate<String> p = (String s) -> {
            return s.length() > 10;
        };

        boolean pp =p.test("Mississippi");
        System.out.println(pp);

        //8
        LongUnaryOperator luo = (long l) -> {
            return -l;
        };

        long ll = luo.applyAsLong(234234);
        System.out.println(ll);

        //9
        IntSupplier is = () -> {
            return 525600;
        };
        int ss = is.getAsInt();
        System.out.println(ss + " minutes");

        //10
        ToDoubleBiFunction<Integer,Long> td = (Integer i, Long l) -> {
            return i*i + l*l;
        };
        double bif = td.applyAsDouble(23, 991224L);
        System.out.println(bif);


        // mt - extend thread or implement runnable
        // join() waits
        // type erasure - generic erased by defined type

    }

}
