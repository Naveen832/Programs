package LinearSearch;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {23,43,55,442};
        System.out.println(MaxValue(arr));

    }
    static int MaxValue(int[] arr){
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }
}
