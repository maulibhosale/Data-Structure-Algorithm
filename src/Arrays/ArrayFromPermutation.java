package Arrays;

import java.util.Arrays;

public class ArrayFromPermutation {

    public int[] buildArray(int[] nums) {

        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[nums[i]];
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayFromPermutation a = new ArrayFromPermutation();
        int[] result = a.buildArray(new int[]{5,0,1,2,3,4});
        System.out.println(Arrays.toString(result));
    }
}
