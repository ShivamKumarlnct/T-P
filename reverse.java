public class reverse {

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3,4,5,6,7 };
        int temp;
        for (int i = 0; i < arr.length/2; i++) {
            int j = arr.length - 1-i;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
