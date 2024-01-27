package LinearSearch;

public class FoundTheIndex {
    public static void main(String[] args) {
        int[] arr = {12, 342, 23, 1, 23, 34, 423, 44};
        int target = 1;
        int ans = linearSearch (arr, target);
        System.out.println(ans);


    }


    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
            return -1;
        }
    }



