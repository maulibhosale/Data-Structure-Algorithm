package Arrays;

public class TargetNumber {
    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 42, 15};
        System.out.println(search(arr, 100));
    }

    static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target) {
                return i;
            }
        }
        return -1;
    }
}
