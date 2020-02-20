package labs_examples.objects_classes_methods.labs.methods;

public class MethodTraining {

    public static void main(String[] args) {

        int largest = largestFour(1, 2, 3, 4);

        System.out.println("The largest of the given numbers is " + largest);

        int numberConsonants = countConsonants("Turducken");

        System.out.println("The number of consonants is " + numberConsonants);

    }

    // 3. creating a method that will return the largest of 4 numbers
    // (all of which are passed in as arguments or parameters
    public static int largestFour(int a, int b, int c, int d) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;
        return max;
    }

    // 4. write method to count all consonants (the opposite of vowels) in a String
    public static int countConsonants(String stringToCount) {

        String line = stringToCount;
        int vowels = 0, consonants = 0;

        line = line.toLowerCase();
        for (int i = 0; i < line.length(); ++i) {
            char ch = line.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                ++vowels;
            } else if ((ch >= 'a' && ch <= 'z')) {
                ++consonants;
            }
        }
        return consonants;
    }
}