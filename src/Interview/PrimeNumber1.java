package Interview;

import java.util.Scanner;

public class PrimeNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count = 0;
        for (int i=2;i<=n/2;i++){
            if (n%i==0){
                count=1;
            }
        }

    }
        if(count==0) {
        System.out.println("not peimw");
    }
        else{
            System.out.println(" prime");
    }
}