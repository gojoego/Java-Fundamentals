package videos_source_code.arrays;

public class twod_array_forloop {

    public static void main(String[] args) {

        int[][] twoD = new int[4][7];

        for (int i = 0; i < twoD.length; i++) {

            for (int j = 0; j < twoD[i].length; j++) {

                twoD[i][j] = i * j;

                System.out.println(twoD[i][j] + " - ");

            }

            // here we'll print out a new line
            System.out.println();

        }

    }

}
