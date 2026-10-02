package Arrays;

import java.util.Arrays;

public class SmallerNumbers {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int add = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] < nums[i] ) {
                    add ++;
                }
                count[i] = add;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        SmallerNumbers s = new SmallerNumbers();
        int[] ans = s.smallerNumbersThanCurrent(new int[]{8,1,2,2,3});
        System.out.println(Arrays.toString(ans));
    }
}
