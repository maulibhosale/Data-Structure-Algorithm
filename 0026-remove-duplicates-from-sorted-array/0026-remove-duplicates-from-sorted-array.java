class Solution {
    public int removeDuplicates(int[] nums) {
        int ans = 1;
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i] ) {
            }
            else {
               nums[index] =nums[i];
                index ++;
                ans++;
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
        return ans;
    }
}