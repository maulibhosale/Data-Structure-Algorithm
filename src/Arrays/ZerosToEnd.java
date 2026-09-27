package Arrays;

import java.util.Arrays;

public class ZerosToEnd {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        solve(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void solve(int[] arr) {

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        for (int i = index; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
}
