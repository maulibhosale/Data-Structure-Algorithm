package Arrays;
import java.util.Arrays;
public class ShiftByK {
    public int[] solve(int[] arr, int k){
        int[] sol = new int[arr.length];
        int temp = k;
        for (int i = 0; i <= k; i++) {
            sol[i] = arr[temp+1];
            temp++;
        }
        for (int i = k+1, j = 0; i < arr.length; i++, j++) {
            sol[i] = arr[j];
        }
        return sol;
    }
    public static void main(String[] args) {
        ShiftByK s = new ShiftByK();
        int[] ans = s.solve(new int[]{2, 3, 4, 5, 6, 7, 8, 9}, 3);
        System.out.println(Arrays.toString(ans));
    }
}
