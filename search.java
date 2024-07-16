public class search {
    public static int search(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if (arr[i]==target) {
                return i;
            }
        }
        return 0;
    }
    public static void main(String args[]){
        int arr[]={4,5,6,7,0,2};
        int target=0;
        search(arr,target);
        System.out.println("this is idx of target:"+search(arr, target));
    }
    
}
