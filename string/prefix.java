package string;
public class prefix{
    public static String prefix(String str[]){
        StringBuilder str1=new StringBuilder();
        for(int i=0;i<str[0].length();i++){
            char ch=str[0].charAt(i);
            for(int j=1;j<str.length;j++){
                if(str[j].charAt(i)!=ch){
                    return str1.toString();
                }
            }
            str1.append(ch);
        }
        return str1.toString();
    }
    public static void main(String[] args) {
        String str[]={"flower","flow","flight"};
       String res= prefix(str);
       System.out.println(res);
    }
}