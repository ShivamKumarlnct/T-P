package string.recursion;

public class recursion {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
       int fact=n*factorial(n-1);
       return fact;
    }
    public static void main(String args[]){
        int n=5;
        factorial(n);
        System.out.println(factorial(n));
    }
}
