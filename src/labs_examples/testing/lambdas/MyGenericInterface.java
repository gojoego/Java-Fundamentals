package labs_examples.testing.lambdas;

@FunctionalInterface
public interface MyGenericInterface<T,V> {

    public T modify(V val);

}

class GenericLambdaExample{

    public static void main(String[] args) {

        MyGenericInterface<Integer,String> obj = (String val) -> {
            return Integer.parseInt(val);
        };

        int i = obj.modify("77");
        System.out.println(i);

        MyGenericInterface<Character, String> obj2 = (String val) -> {
            char c = val.charAt(0);
            return c;
        };

        char c = obj2.modify("Hello");
        System.out.println(c);

    }

}