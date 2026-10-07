package Arrays;

public class unsorted {

    public void Solve(int[] nums) {
        int unsorted = 0;
        int[] temp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < temp.length; j++) {
                if(nums[i] > temp[j]){
                    unsorted = temp[j];
                }
            }
        }
        System.out.println(unsorted);
    }

    static void main(String[] args) {
        unsorted u = new unsorted();
        u.Solve(new int[]{1,2,5,4,8});
    }
}
