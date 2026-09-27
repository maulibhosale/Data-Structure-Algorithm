package Arrays;

public class Minimum {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 2, 20, 3};
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int minVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if ( minVal > arr[i]) {
                minVal = arr[i];
            }
        }
        return minVal;
    }
}
