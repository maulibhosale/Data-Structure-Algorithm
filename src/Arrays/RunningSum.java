package Arrays;

import java.util.Arrays;

public class RunningSum {

    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i-1] + nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        RunningSum r = new RunningSum();
        int[] ans = r.runningSum(new int[]{1,2,3,4});

        System.out.println(Arrays.toString(ans));
    }
}
