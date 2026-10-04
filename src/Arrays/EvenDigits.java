package Arrays;

public class EvenDigits {

    public int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            int n = nums[i];
            int digits = 0;

            while (n > 0) {
                digits++;
                n = n / 10;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main() {
        EvenDigits e = new EvenDigits();
        int ans = e.findNumbers(new int[]{12,345,2,6,7896});
        System.out.println(ans);
    }
}
