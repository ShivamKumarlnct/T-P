package string.recursion;

public class sum {
    public static int sum(int n){
        if(n==0){
            return 1 ;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        sum(n);
        System.out.println(sum(n));
    }
    
}
