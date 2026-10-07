package Arrays;

public class ColumMax {

    public void calculate(int[][] arr){
        for (int i = 0; i < arr[0].length; i++) {
            int max = arr[0][i];
            for (int j = 0; j < arr.length; j++) {
                if(max < arr[j][i]){
                    max = arr[j][i];
                }
            }
            System.out.println("Column ["+ (i+1) +"] = " +max);
        }
    }

    static void main(String[] args) {
        int[][] arr = {
                {4, 8, 2},
                {7, 1, 9},
                {3, 6, 5}
        };
        ColumMax cs = new ColumMax();
        cs.calculate(arr);
    }
}
