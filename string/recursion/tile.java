package string.recursion;

public class tile {
    public static int tilling(int n){
        if(n==0 ||n==1){
            return 1;
        }
        int vertical = tilling(n - 1);
        int horiical = tilling(n - 2);

        int totalway=vertical+horiical;
        return totalway;
    }
    public static void main(String args[]){
        int n=4;
        tilling(n);
        System.out.println("count ways:"+tilling(n));
    }
    
}
