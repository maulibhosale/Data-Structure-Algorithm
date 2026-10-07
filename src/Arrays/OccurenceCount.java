package Arrays;

public class OccurenceCount {

    public void check(int[][] arr, int target){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target) {
                    count++;
                }
            }
        }
        System.out.println(target+ " occurs " +count+ " times");
    }

    static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {2, 4, 2},
                {5, 2, 6}
        };
        OccurenceCount oc = new OccurenceCount();
        oc.check(arr, 2);
    }
}
