package Interview;

public class CountRangeEvenODD {
    public static void main(String[] args) {
        int i,j;
        int even = 0;
        int odd =0;
        for (i=0;i<=100;i++){
            if (i%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("even numbers are : "+even);
        System.out.println("odd numbers are: "+odd);

    }
}
