package videos_source_code.oop.static_nonstatic;

public class StaticMethEx {

    class Main {
        public static void main(String[] args) {

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

}
