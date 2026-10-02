package Arrays;

import java.util.Arrays;

public class Shuffle {

    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i+=2) {
            ans[i] = nums[i/2];
        }
        for (int i = 1; i < nums.length; i+=2) {
            ans[i] = nums[n];
            n++;
        }
        return  ans;
    }

    public static void main(String[] args) {
        Shuffle s = new Shuffle();
        int[] show = s.shuffle(new int[]{2,5,1,3,4,7}, 3);
        System.out.println(Arrays.toString(show));
    }
}
