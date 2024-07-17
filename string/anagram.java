package string;

public class anagram {
    public static boolean anagram(String s,String t){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<t.length();j++){
                if(s.charAt(i)!=t.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[]){
        String s="anagram";
        String t="nagrama";
        anagram(s,t);
    }
    
}
