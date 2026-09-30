package Arrays;

public class Unique {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 4, 5, 6};

        solve(arr1, arr2 );
    }

    static void solve(int[] arr1, int[] arr2){

        int[] printed = new int[arr1.length + arr2.length];
        int count = 0;

        boolean is_printed;

        for (int i = 0; i < arr1.length; i++) {

            is_printed = false;

            for (int j = 0; j < count; j++) {
                if (printed[j] == arr1[i]) {
                    is_printed = true;
                    break;
                }
            }

            if (!is_printed) {
                printed[count] = arr1[i];
                count++;
                System.out.print(arr1[i] + " ");
            }
        }
        for (int i = 0; i < arr2.length; i++) {

            is_printed = false;

            for (int j = 0; j < count; j++) {
                if (printed[j] == arr2[i]) {
                    is_printed = true;
                    break;
                }
            }

            if (!is_printed) {
                printed[count] = arr2[i];
                count++;
                System.out.print(arr2[i] + " ");
            }
        }
    }
}
