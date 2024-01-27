package Interview;

public class countDigit {
    public static void main(String[] args) {
        int n =123455678;
        int i =0;
        while(n>0){
            n=n/10;
            i++;
        }
        System.out.println("no of digits is: "+i);
        System.out.println("no of digits is: "+n);
    }
}
