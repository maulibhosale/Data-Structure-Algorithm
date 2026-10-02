package Arrays;

import java.util.Arrays;

public class GoodPairs {

    public int numIdenticalPairs(int[] nums) {

        int goodPairs = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i<j && nums[i] == nums[j]) {
                    goodPairs++;
                }
            }
        }
        return goodPairs;
    }

    public static void main(String[] args) {

        GoodPairs g = new GoodPairs();
        int ans = g.numIdenticalPairs(new int[]{1,1,1,1});
        System.out.println(ans);
    }
}
