package string.recursion;


public class reverse {
    public static int reverse(int arr[]){
        if(arr.length==0){
            return 0;
        }
        reverse(arr)
    }
    public static void main(String args[]){
        int arr[]={1,2,3,5,6};
        reverse(arr);
    }
    
}