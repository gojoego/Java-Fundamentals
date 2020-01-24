package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        // write code here
        // volume of a cylinder = 3.14(3.14*3.14)*5
        double vol = Math.PI * (3.14*3.14) * 5;
        System.out.println("The volume is "+vol);

        // surface area of a cylinder = 2 * (3.14) * (3.14 * 3.14) + 2 * (3.14) * (3.14*5)
        double sa = 2 * Math.PI * (3.14 * 3.14) + 2 * Math.PI * (3.14*5);
        System.out.println("The surface area is "+sa);

    }
}
