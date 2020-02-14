package videos_source_code.conditional_statements;

public class whileloop_ex1 {

    public static void main(String[] args) {

        // while loop- essentially repeating if statement

        // introduce variable into condition of while loops
        int a = 0;

        while (a < 100) {
            System.out.println(a);
            // a = a + 1
            // will be infinite loop unless you declare the below statement
            // loop will run 100x until 100 < 100 which is not true so loop finishes
            a++;
        }

        System.out.println("Loop Finished.");

    }
}
