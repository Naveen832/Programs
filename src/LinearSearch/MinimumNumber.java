package LinearSearch;

public class MinimumNumber {
    public static void main(String[] args) {

        int[] arr = {12,4,3,1,-9};
        System.out.println(MinValue(arr));

    }


    static int MinValue(int[] arr){
        int min = arr[0];
        for (int i =1;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
