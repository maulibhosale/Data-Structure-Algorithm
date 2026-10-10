package Arrays;

import java.util.Arrays;

public class MatrixAddition {

    public int[][] solve(int[][] Arr1, int[][] Arr2) {
        int[][] sum = new int[Arr1.length][Arr1[0].length];

        for (int i = 0; i < Arr1.length; i++) {
            for (int j = 0; j < Arr1[i].length; j++) {
                sum[i][j] = Arr1[i][j];
            }
        }

        for (int i = 0; i < Arr2.length; i++) {
            for (int j = 0; j < Arr2[i].length; j++) {
                sum[i][j] += Arr2[i][j];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] Arr1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] Arr2 = {
                {7, 8, 9},
                {1, 2, 3}
        };

        MatrixAddition m = new MatrixAddition();
        int[][] ans = m.solve(Arr1, Arr2);
        System.out.println(Arrays.deepToString(ans));

    }
}
