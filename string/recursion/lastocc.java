package string.recursion;

public class lastocc {
    public static int lastoccurence(int arr[],int key,int i){
        if(i<0){
            return -1; 
        }
        if(arr[i]==key){
            return i;
        }
        return lastoccurence(arr, key, i-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,2,3,4};
        int key=2;
        lastoccurence(arr,key,0);
        System.out.println("index of:"+key+":is:"+lastoccurence(arr, key, arr.length-1));
    }
    
}
