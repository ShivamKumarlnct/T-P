public class maxandmin {
    public static void main(String args[]){
        int arr[]={3,5,4,1,9};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("man value:"+max);
        System.out.println("min value:"+min);
    }
}
