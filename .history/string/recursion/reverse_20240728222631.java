package string.recursion;


public class reverse {
    public static int reverse(int arr[]){
        int n=arr.l
        if(arr.length==0){
            return 0;
        }
        reverse(arr,arr.lenght-1);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,5,6};
        reverse(arr);
    }
    
}
