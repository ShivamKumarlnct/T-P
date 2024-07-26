package string.recursion;

public class power {
    public static int power(int x,int n){
        if(n<1){
            return 1;
        }
       int power= x*power(x, n-1);
       return power;
    }
    public static void main(String[] args) {
        int x=5;
        int n=5;
        power(x,n);
        System.out.println(power(x, n));
    }
    
}
