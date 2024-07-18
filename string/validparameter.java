package string;
import java.util.*;

public class validparameter {
    public static void main(String args[]){
        String s=" {[()]";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('| s.charAt(i) =='{'| s.charAt(i) =='[')
                count++;
            
            if (s.charAt(i) == ')' | s.charAt(i) == '}' | s.charAt(i) == ']') {
                count--;
            }
        }
        if(count==0){
            System.out.println("valid");
        }else{
            System.out.println("not");
        }

    }
    
}
