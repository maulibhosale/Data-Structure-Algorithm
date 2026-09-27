package Arrays;

public class CountNumbers {

    public static void main(String[] args) {
        int[] arr = {5, -2, 0, 8, -7, 0, 3};
        System.out.println(countNumber(arr));
    }

    static String countNumber(int[] arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int num : arr) {
            if (num > 0) {
                positive ++;
            } else if ( num == 0) {
                zero ++;
            }
            else {
                negative ++;
            }
        }
        return "Positive=" +positive+ " ; Negative=" +negative+ " ; Zero=" +zero;
    }
}
