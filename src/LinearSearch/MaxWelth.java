package LinearSearch;

public class MaxWelth {
    public static void main(String[] args) {
        int[][] acc = {
                {25, 4, 54},
                {34, 23, 214}
        };

        System.out.println(maximumvalue1(acc));

    }

    static int maximumvalue1(int[][] acc){
        int ans = Integer.MIN_VALUE;
        for (int i = 0;i<=acc.length;i++){
            int sum=0;
            for (int j = 0;j<acc[i].length;j++){
                sum =sum+acc[i][j];

            }
            if (sum>ans){
                ans = sum;

            }
        }
        return ans;
    }
}
