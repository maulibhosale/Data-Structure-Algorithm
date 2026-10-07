package Arrays;

public class SecondaryDiagonalSum {

    public int Calculate(int[][] arr) {
        int sum = 0;

        for (int i = 0, j = arr[0].length-1; i < arr.length; i++, j--) {
            sum += arr[i][j];
        }

        return sum;
    }

    static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        SecondaryDiagonalSum sd = new SecondaryDiagonalSum();
        System.out.println(sd.Calculate(arr));
    }
}
