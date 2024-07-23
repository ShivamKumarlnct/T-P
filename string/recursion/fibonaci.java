package string.recursion;

public class fibonaci {
    public static int fibonacinum(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        int fib1=fibonacinum(n-1);
        int fib2=fibonacinum(n-2);
        return fib1+fib2;
    }
    public static void main(String[] args) {
        // int arr[]={0,1,1,2,3,5,8};
        int n=10;
        System.out.println(fibonacinum(n));



    }
    
}
