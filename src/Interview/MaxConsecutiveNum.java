package Interview;

public class MaxConsecutiveNum {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,1,0,1,1,1,1,0};
        int count=0;
        int maxcount =0;
        for (int i=0;i<=arr.length-1;i++){
            if (arr[i]==1){
                count++;
                maxcount = (maxcount<count)?count:maxcount;
            }
            else {
                count=0;
            }
        }
        System.out.println("max count: "+maxcount);

    }
}
