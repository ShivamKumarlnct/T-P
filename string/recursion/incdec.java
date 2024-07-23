package string.recursion;

public class incdec {
    public static void incer(int n){
        if(n==0){
            return ;
        }
        incer(n-1);//increasing
        System.out.println(n);
        // incer(n-1);//decreasing

    }
    public static void main(String args[]){
        int n=10;
        incer(n);
    }
}
