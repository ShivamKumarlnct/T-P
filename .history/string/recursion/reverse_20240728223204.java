package string.recursion;


public class reverse {
    public static int reverse(int arr[],int i){
        int n=arr.length;
        if(arr.length==0){
            return 0;
        }
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
       return reverse(arr,i+1);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,5,6};
        reverse(arr,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    
}
