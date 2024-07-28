package string.recursion;


public class reverse {
    public static int reverse(int arr[],int i){
        int n=arr.length;
        if(arr.length==0){
            return 0;
        }
       return reverse(arr,n-i);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,5,6};
        reverse(arr,arr.length);
        for(int i=0;i<arr.length;i++){
            sout
        }
    }
    
}
