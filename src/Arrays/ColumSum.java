package Arrays;

//Revision

public class ColumSum {

    public void calculate(int[][] arr){
        for (int i = 0; i < arr[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
            }
            System.out.println("Column ["+ (i+1) +"] = " +sum);
        }
    }

    static void main(String[] args) {
        int[][] arr = {
                {4, 8, 2},
                {7, 1, 9},
                {3, 6, 5}
        };
        ColumSum cs = new ColumSum();
        cs.calculate(arr);
    }
}
