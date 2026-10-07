package Arrays;

public class RowSum {

    public void calculate(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Row ["+ (i+1) +"] = " +sum);
        }
    }

    static void main(String[] args) {
        int[][] arr = {
                {4, 8, 2},
                {7, 1, 9},
                {3, 6, 5}
        };

        RowSum r = new RowSum();
        r.calculate(arr);

    }
}
