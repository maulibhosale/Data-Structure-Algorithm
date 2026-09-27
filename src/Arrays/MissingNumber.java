package Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.print(solve(arr));
    }

    static int solve(int[] arr) {
        int sum = 0;
        int expexcted = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        for (int i = 0; i <= arr.length; i++) {
            expexcted += i;
        }

        return expexcted - sum;
    }
}
