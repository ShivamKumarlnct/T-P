package string;

public class countduplicate {
    public static void coutndup(String str) {
        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            System.out.println(count);

        }
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        coutndup(str);
    }
}
