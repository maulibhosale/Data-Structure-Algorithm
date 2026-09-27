package Arrays;

public class Sum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(sum(arr));
    }

    static int sum(int[] arr) {
        int x = 0;

        for (int i = 0; i < arr.length; i++) {
            x += arr[i] ;
        }
        return x;
    }
}
