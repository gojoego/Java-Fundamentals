public class while_loop1 {

    public static void main(String[] args) {

        int count = 0;
        int val = 0;

        // write a while loop below that will loop until "count" is no longer less than 10
        // within the while loop, add the value of "count" to the current value of "val"
        // then, increment your counter variable

        while (count < 10) {
            val += count;
            count++;
        }

        System.out.println(val);

    }
}
