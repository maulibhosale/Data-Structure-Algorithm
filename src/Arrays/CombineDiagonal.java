package Arrays;

public class CombineDiagonal {

    public int Calculate(int[][] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            sum += arr[i][arr.length-1-i];
        }
        if (arr.length % 2 != 0) {
            sum -= arr[arr.length / 2][arr.length / 2];
        }

        return sum;
    }

    static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        CombineDiagonal cd = new CombineDiagonal();
        System.out.println(cd.Calculate(arr));
    }
}
