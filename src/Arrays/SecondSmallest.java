package Arrays;

public class SecondSmallest {

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15};
        System.out.println(solve(arr));
    }

    static int solve(int[] arr) {
        int smallest = arr[0];
        int sndsmallest = Integer.MAX_VALUE ;

        for (int i=1; i < arr.length ; i++ ) {
            if (arr[i] < smallest ) {
                smallest= arr[i];
            }
        }

        for (int i=1; i < arr.length ; i++ ) {
            if (arr[i] > smallest && arr[i] < sndsmallest) {
                sndsmallest= arr[i];
            }
        }

        return sndsmallest;
    }

}
