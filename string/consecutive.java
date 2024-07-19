package string;

public class consecutive {
    public static String conce(String str){
        StringBuilder str1=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(i+1==str.length()||str.charAt(i)!=str.charAt(i+1)){
                str1.append(str.charAt(i));
            }

        }
        return str1.toString();
    }
    public static void main(String args[]){
        String str="aabbaa";
       String res= conce(str);
       System.out.println(res);
       
    }
    
}
