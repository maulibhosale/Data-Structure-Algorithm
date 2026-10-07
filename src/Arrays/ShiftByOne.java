package Arrays;
import java.util.Arrays;
public class ShiftByOne {
    public int[] solve(int[] arr) {
        int[] sol = new int[arr.length];
        sol[0] = arr[arr.length-1];
        for (int i = 1; i <= arr.length-1; i++) {
            sol[i] = arr[i-1];
        }
        return sol;
    }

    static void main(String[] args) {
        ShiftByOne d = new ShiftByOne();
        int[] ans = d.solve(new int[]{1, 2, 3, 4, 5, 6});
        System.out.println(Arrays.toString(ans));
    }
}
