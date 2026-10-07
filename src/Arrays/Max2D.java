package Arrays;

public class Max2D {

    public int CalMax(int[][] arr) {
        int maximum = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(maximum < arr[i][j]){
                    maximum = arr[i][j];
                }
            }
        }
        return maximum;
    }

    static void main(String[] args) {
        int[][] arr = {
                {4, 8, 2},
                {7, 1, 9},
                {3, 6, 5}
        };

        Max2D m = new Max2D();
        int ans = m.CalMax(arr);
        System.out.println(ans);

    }

}
