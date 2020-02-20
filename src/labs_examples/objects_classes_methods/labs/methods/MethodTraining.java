package labs_examples.objects_classes_methods.labs.methods;

public class MethodTraining {

    public static void main(String[] args) {

        int largest = largestFour(1,2,3,4);

        System.out.println(largest);

    }
    // 3. creating a method that will return the largest of 4 numbers
    // (all of which are passed in as arguments or parameters
    public static int largestFour(int a, int b, int c, int d){
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;
        return max;
    }
}
