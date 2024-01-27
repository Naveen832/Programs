package Interview;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 12345;
        int i,sum=0;
        while (n>0){
            i=n%10;
            sum = sum+i;
            n=n/10;
        }
        System.out.println("sumof the digits is:"+sum);
    }
}
