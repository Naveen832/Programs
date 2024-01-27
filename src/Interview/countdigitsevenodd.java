package Interview;

public class countdigitsevenodd {
    public static void main(String[] args) {
        int evencount=0;
        int oddcount=0;
        for (int i=1;i<=100;i++){
            if (i%2==0){
                evencount =evencount+i;
            }
            else {
                oddcount = oddcount+i;
            }

        }
        System.out.println(evencount);
        System.out.println(oddcount);
    }
}
