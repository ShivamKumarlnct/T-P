package string;

public class string {
    public static boolean pallidrom(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;

    }
    public static void main(String args[]){
        String str="A man a plan a canal panama";
        pallidrom(str);
        System.out.println(pallidrom(str));
    }
    
}
