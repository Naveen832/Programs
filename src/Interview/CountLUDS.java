package Interview;

public class CountLUDS {
    public static void main(String[] args) {
        String s = "Welcome JAVA @12345 @#$%";
        int Lcount=0;
        int Ucount=0;
        int numberCount =0;
        int specialCount = 0;
        for (int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if (Character.isLowerCase(ch)){
            Lcount++;
            
        } else if (Character.isUpperCase(ch)) {
            Ucount++;
        } else if (Character.isDigit(ch)) {
            numberCount++;
            
        }
        else {
            specialCount++;
        }

        }
        System.out.println(" lwer case: "+Lcount);
        System.out.println(" upper case: "+Ucount);
        System.out.println(" digits case: "+numberCount);
        System.out.println(" special case: "+specialCount);


        }
}
