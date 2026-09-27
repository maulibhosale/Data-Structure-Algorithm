package Arrays;

public class Occurrences {

    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 8, 2, 9, 5};
        System.out.print(countOccurrences(arr, 2));
    }

    static int countOccurrences(int[] arr, int target) {
        int output = 0;
        for(int num : arr) {
            if (num == target) {
                output ++;
            }
        }
        return output;
    }
}
