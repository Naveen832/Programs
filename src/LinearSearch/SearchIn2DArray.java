package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {25, 4, 54},
                {34, 23, 214},
                {1, 2, 3, 4},
                {34, 55, 65, 32}
        };
        int target = 65;
        int[] ans = search2D(arr,target);
        //System.out.println(Arrays.search2D(arr, target));
        System.out.println(Arrays.toString(ans));
    }

    static int[] search2D(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int ele = arr[i][j];
                if (ele == target) {
                    return new int[]{i,j};
                }

            }
        }
        return new int[]{-1,-1};

    }
}
