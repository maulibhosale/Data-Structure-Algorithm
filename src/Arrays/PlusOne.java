package Arrays;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] ans = new int[digits.length + 1];
        ans[0] = 1;

        return ans;
    }

    static void main(String[] args) {
        PlusOne p = new PlusOne();
        int[] result = p.plusOne(new int[]{1,9,9});
        System.out.println(Arrays.toString(result));
    }
}
