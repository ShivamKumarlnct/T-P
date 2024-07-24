package string.recursion;

public class sorted {
    public static boolean sorted(int arr[]){
        int i=0;
        if(i==arr.length){
            return true;
        }

        if(arr[i]>arr[i+1]){
            return false;
        }
        sorted(i,i+1);

        return true;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        sorted(arr);
        System.out.println(sorted(arr));
    }
    
}
