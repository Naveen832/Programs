package Interview;

public class Fibanocci {
    public static void main(String[] args) {
        int a= 0;
        int b= 1;
        for (int i=2;i<=30;i++){
           int c = a+b;
           if(c<=100)
            System.out.print(" "+c);
            a=b;
            b=c;


        }
    }
}
