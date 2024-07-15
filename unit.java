public class unit {
    public static void main(String args[]){
        int r=7;
        int unit=2;
        int count=0;
        int sum=0;
        int arr[]={2,8,3,5,7,4,1,2};
        int val = r * unit;
        for(int i=0;i<arr.length;i++){
                sum+=arr[i];
                if(val>sum){
                    count++;
                }
        }
        System.out.println(count);
    }
    
}
