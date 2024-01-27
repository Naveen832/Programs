package LinearSearch;

import java.util.Arrays;

public class Foundelement {
    public static void main(String[] args) {
        int[] a = {2323,21,454,4543,5,4,32,};
        int target = 4;
        int ans = linearSearch(a,target);
       System.out.println(ans);
       // System.out.println(Arrays.toString(a.to));

    }


    static int linearSearch(int[] a,int target){
        if(a.length==0){
            return -1;
        }

        for (int elem:a){
//        for(int i=0;i<a.length;i++)
          // int elem = a[i];
            if (elem == target){
                return elem;
            }
        }
        return -1;
    }
}
