package Arrays;

public class IdentityMatrix {

    public boolean check(int[][] arr) {
        boolean ans = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i!=j) {
                    if(arr[i][j]!=0) {
                        ans = false;
                    }
                }
                if(i==j) {
                    if(arr[i][i]!=1) {
                        ans = false;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        IdentityMatrix im = new IdentityMatrix();
        boolean a = im.check(arr);
        System.out.println(a);
    }
}
