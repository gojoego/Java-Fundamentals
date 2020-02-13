package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        // write your code below
        boolean p = false;
        boolean q = true;

        // AND                  &
        if (p & q){
            System.out.println("P and Q together is false");
        }

        // short-circuit AND    &&

        if (p && q){
            System.out.println("P is true, then Q is true");
        }

        // OR                   |
        if (p | q){
            System.out.println("P or Q are true");
        }

        // short-circuit OR     ||
        if (p || q){
            System.out.println("P and Q are true");
        }

        // XOR                  ^
        if (p ^ q){
            System.out.println("Either P or Q are true but not both");
        }

        // NOT                  !
        if (p != q){
            System.out.println("P is NOT equal to Q");
        }


    }

}

