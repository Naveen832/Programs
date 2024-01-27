package Interview;

import java.util.HashMap;

public class CountEachWord {
    public static void main(String[] args) {
        String s = "naveen Kuamr naveen";
        String[] str = s.split(" ");
        HashMap<String,Integer> emp = new HashMap<String,Integer>();
        for (String st:str){
            if (emp.containsKey(st)){
                int x=emp.get(st);
                emp.put(st,x+1);
            }
            else{
                emp.put(st,1);
            }

        }
        System.out.println(emp);
    }
}
