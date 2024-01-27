package LinearSearch;

import java.util.Arrays;

public class FoundIndexString {
    public static void main(String[] args) {

        String str = "Naveen";
        char target='e';
        System.out.println(LinearString(str,target));
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(LinearString2(str,target));

    }
    static int LinearString2(String str,char target) {
        if (str.length() == 0) {
            return -1;
        }
        for (char ch:str.toCharArray()) {
            if (target == ch) {
                return target;
            }
        }
//        for (char ch:str.toCharArray()) {
//            if(ch==target){
//                return ch;
//            }
//
//        }
        return -1;
    }

    static int LinearString(String str,char target){
        if(str.length()==0){
            return -1;
        }
        for (int i=0;i<str.length();i++){
            if(target == str.charAt(i)){
                return i;
            }
        }
//        for (char ch:str.toCharArray()) {
//            if(ch==target){
//                return ch;
//            }
//
//        }
        return -1;
    }

}
