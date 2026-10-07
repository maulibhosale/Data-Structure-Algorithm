package Arrays;

public class RowMax {

    public void CalMax(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            int maximum = arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {
                if(maximum < arr[i][j]){
                    maximum = arr[i][j];
                }
            }
            System.out.println("Row [" + (i + 1) + "] = " + maximum);
        }
    }

    static void main(String[] args) {
        int[][] arr = {
                {4, 8, 2},
                {7, 1, 9},
                {3, 6, 5}
        };

        RowMax m = new RowMax();
        m.CalMax(arr);

    }
}
