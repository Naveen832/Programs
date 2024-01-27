package LinearSearch;

public class MinValueIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {25, 4, 54},
                {34, 23, 214},
                {1, 2, 3, 4},
                {34, 55, 65, 32}
        };
        System.out.println(Min(arr));
    }

    static int Min(int[][] arr) {
       int min = arr[0][0];
       // int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                for(int aint:arr){
//                    for(int anint:aint ) {
//                    }
//                    }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }

            }
        }
        return min;
    }
}
