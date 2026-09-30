package Arrays;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};
        int count = solve(arr);
        System.out.println(count);
        System.out.println(Arrays.toString(arr));
    }

    static int solve(int[] arr) {
        int num = 1;
        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] == arr[i] ) {
            }
            else {
                arr[index] = arr[i];
                index ++;
                num++;
            }
        }
        for (int i = index; i < arr.length; i++) {
            arr[i] = 0;
        }
        return num;
    }
}
