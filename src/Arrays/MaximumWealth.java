package Arrays;

public class MaximumWealth {

    public int calculate(int[][] accounts){
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {3, 2, 1}
        };
        MaximumWealth mw = new MaximumWealth();
        int ans = mw.calculate(arr);
        System.out.println(ans);
    }


}
