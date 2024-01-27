package LinearSearch;

public class EvenDidgitcount {
    public static void main(String[] args) {
        int[] nums = {12, 34, 333, 5644};
      //  System.out.println(findnumbers(nums));

        System.out.println(digits2(-348473));

    }

    static int findnumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberofdigits = digits(num);
        if (numberofdigits % 2 == 0) {
            return true;
        }
        return false;
        //return numberofdigits%2 ==0;
    }
    //count the number of digits

    static int digits2(int num){
        if (num < 0){
            num =num*-1;
        }
        return (int)(Math.log10(num))+1;
    }

    static int digits(int num) {
        if (num < 0){
            num =num*-1;
        }
        if (num==0){
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }


}


