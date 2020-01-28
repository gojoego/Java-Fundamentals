package videos_source_code.conditional_statements;

public class flow_control_ex1 {

        public static void main(String[] args){
            demonstrateVoidReturn(5);
            int a = multiply(456, 987);
            System.out.println("a = " + a);
        }
        public static void demonstrateVoidReturn(int num){
            if (num < 20) {
                // we will simply exit this method without doing anything else if num is less than 20
                return;
            } else {
                System.out.println("num is >= 20");
            }
        }
        public static int multiply(int a, int b){
            int x = a * b;
            // now we'll return the int value x to the calling method this method
            //  declares "int" as it's return type and we're returning an int so all is well
            return x;
        }
    }

