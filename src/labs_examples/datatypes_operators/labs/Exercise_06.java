package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        // volume of a cylinder = pi * (r * r) * height
        // radius = 3.14
        // height = 5
        // utilize Math.PI
        double volCylinder = Math.PI * (3.14 * 3.14) * 5;
        System.out.println("The volume is " + volCylinder);

        // surface area of a cylinder =
        // 2 * pi * (r * r)
        // + 2 * pi * (3.14* height)
        // radius = 3.14
        // height = 5
        double surfaceArea = 2 * Math.PI * (3.14 * 3.14) + 2 * Math.PI * (3.14 * 5);
        System.out.println("The surface area is " + surfaceArea);

    }
}