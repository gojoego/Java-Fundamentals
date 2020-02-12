package videos_source_code.arrays;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class multidarray_ex1 {

    public static void main(String[] args) {

        int[][] vals = new int[5][5];

        int count = 0;

        // populate array
        for(int i = 0; i < vals.length; i++){
            for(int x = 0; x < vals[1].length; x++){
                vals[i][x] = count;
                count++;
            }
        }

        for(int i = 0; i < vals.length; i++) {
            for (int x = 0; x < vals[1].length; x++) {
                System.out.println(vals[i][x] + " | ");
            }
            System.out.println();
        }
    }
}
