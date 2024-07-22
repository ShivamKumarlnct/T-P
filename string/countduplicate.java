package string;

public class countduplicate {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        int count=0;
        for(int i=0;i<str.length();i++){
          for(int j=0;j<str.length();j++){
            if(str.charAt(i)==str.charAt(j)){
                count++;
                continue;
            }
          }
          System.out.println(str.charAt(i) + count);

        }
    }
    
}
