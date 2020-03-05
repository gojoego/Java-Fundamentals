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

    }

}