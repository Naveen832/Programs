package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={12,34,65,432,23,45};
        int target = 65;
        System.out.println(linearSearch(arr,target,2,4));

    }
    static int linearSearch(int[] arr, int target,int start,int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index < end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
