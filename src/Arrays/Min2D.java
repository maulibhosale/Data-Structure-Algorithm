package Arrays;

public class Min2D {
    public int CalMin(int[][] arr) {
        int minimum = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(minimum > arr[i][j]){
                    minimum = arr[i][j];
                }
            }
        }
        return minimum;
    }

    static void main(String[] args) {
        int[][] arr = {
                {4, 8, 2},
                {7, 1, 9},
                {3, 6, 5}
        };

        Min2D mn = new Min2D();
        int ans = mn.CalMin(arr);
        System.out.println(ans);

    }
}
