package videos_source_code.oop.static_nonstatic;

public class StaticMethEx {

    public static void main(String[] args) {

        int x = MyMath.multiply(3,4);

        int y = MyMath.multiply(3,4);

        System.out.println(x);
        System.out.println(y);


        // demonstrate how to invoke both method in the MyMath class below

    }
}

class MyMath{
    public static int multiply(int a, int b){
        return a * b;
    }

    public static int divide(int a, int b){
        if (b == 0){
            return -1;
        } else {
            return a/b;
        }
    }
}