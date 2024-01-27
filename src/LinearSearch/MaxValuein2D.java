package LinearSearch;

import java.util.Arrays;

public class MaxValuein2D {
    public static void main(String[] args) {
    int[][] arr = {
            {25, 4, 54},
            {34, 23, 214},
            {1, 2, 3, 4},
            {34, 55, 65, 32}
    };
    //int target = 65;
    //System.out.println(Arrays.search2D(arr, target));
        System.out.println(Max(arr));

}
    static int Max(int[][] arr) {
        //int max = arr[0][0];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                for(int aint:arr){
//                    for(int anint:aint ) {
//                    }
//                    }
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }

            }
        }
        return max;
    }
}
