package Arrays;

import java.util.Arrays;

public class Transpose {

    public int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }

    static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        Transpose t = new Transpose();
        int[][] solution = t.transpose(matrix);
        System.out.println(Arrays.deepToString(solution));
    }
}
