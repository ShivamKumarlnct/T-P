package string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class anagram {
    public static boolean anagram(String s,String t){
       if(s.length()!=t.length()){
        return false;
       }
       char[] st = s.toCharArray();
       char[] ts = t.toCharArray();
       Arrays.sort(st);
       Arrays.sort(ts);
        return Arrays.equals(st, ts);
    }
    public static void main(String args[]){
        String s="shiv";
        String t="hivs";
        anagram(s,t);
        System.out.println(anagram(s, t));
    }
    
}
