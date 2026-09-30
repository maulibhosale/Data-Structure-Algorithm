package Arrays;

public class DifferenceMaxAndMin {

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15};
        System.out.println(diff(arr));
    }
    static int diff(int[] arr) {
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        return maximum - minimum;
    }
}
