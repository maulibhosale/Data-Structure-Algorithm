package Arrays;

import java.util.Arrays;

public class ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] ans = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            ans[i+n] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {

        ConcatenationOfArray c = new ConcatenationOfArray();
        int[] result = c.getConcatenation(new int[]{1,3,2,1});
        System.out.println(Arrays.toString(result));
    }
}
