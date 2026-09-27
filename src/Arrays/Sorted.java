package Arrays;

public class Sorted {

    public static void main(String[] args) {
       int[] arr = {5, 5, 6, 8, 8} ;
        System.out.print(Check(arr));
    }

    static boolean Check(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;

    }
}
