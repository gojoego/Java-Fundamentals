package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 * <p>
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int c = 1;
        int d = 2;
        if (c < d) {
            System.out.println("c is less than d");
        }

        // write your code below
        int a = 10;
        int b = 11;
        if (a < b) {
            System.out.println("a is less than b");
        }
        if (a <= b) {
            System.out.println("a is less than or equal to b");
        }
        if (a < b) {
            System.out.println("a is greater than b");
        }
        if (a >= b) {
            System.out.println("a is greater than or equal to b");
        }
        if (a == b) {
            System.out.println("a is equal to b");
        }
        if (a != b) {
            System.out.println("a is NOT equal to b");
        }

    }

}

