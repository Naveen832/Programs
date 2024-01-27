package Interview;

public class PalidromeString {
    public static void main(String[] args) {
        String str = "MADAM";
        String rev = "";
        for (int i=str.length()-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        if (str.equals(rev)) {

            System.out.println("it is palidrome");
        }
        else {
            System.out.println("it is not palidrome");
        }
    }
}
