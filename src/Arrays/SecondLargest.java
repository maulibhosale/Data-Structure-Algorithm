package Arrays;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = {-10, -5, -20, -8};
        System.out.println(solve(arr));
    }

    static int solve(int[] arr) {
        int largest = arr[0];
        int sndLargest = Integer.MIN_VALUE ;
        for (int i=1; i < arr.length ; i++ ) {
            if (arr[i] > largest ) {
                largest= arr[i];
            }
        }
        for (int i=1; i < arr.length ; i++ ) {
            if (arr[i] < largest && arr[i] > sndLargest) {
                sndLargest= arr[i];
            }
        }
        return sndLargest;
    }

}
