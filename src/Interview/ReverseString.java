package Interview;

public class ReverseString {
    public static void main(String[] args) {
        int i;
        String str = "naveen";
        String rev = " ";
      //  int len = str.length();
        for (i=str.length()-1;i>=0;i--){
            rev = rev+str.charAt(i);


        }
        System.out.println(rev);

    }
}
