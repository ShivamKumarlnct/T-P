package string;
public class conversionintonum{
    public static String convertintonums(String str[],String input ){
        int n=input.length();
        String ans=" ";
        for(int i=0;i<n;i++){
            if(input.charAt(i)==' ')
                ans=ans+"0";
            
            else{
                int indx=input.charAt(i)-'A';
                ans=ans+str[indx];
            }

        }
        return ans;

    }
    public static void main(String[] args) {
        String str[]={"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777",
        "8","88","888","9","99","999","9999"

        };
        String input="GEEKSFORGEEKS";
        System.out.println(convertintonums(str,input));

    }
}