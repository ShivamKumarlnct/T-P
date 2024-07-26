package string.recursion;

public class occurence {
    public static int occurence(int arr[],int key,int i){
        if(i==arr.length-1){
            return 0;
        }
        if(arr[i]==key){
            return i;
        }
      return  occurence(arr, key, i+1);
    }
    public static void main(String args[]){
        int arr[]={8,3,6,9,5,10,2,5,3,11};
        int key=10;
        occurence(arr,key,0);
        System.out.println(occurence(arr, key, 0));
    }
    
}
