package Arrays;

public class CountEvenOdd {

    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 21, 22};
        System.out.print(countEvenOdd(arr));
    }

    static String countEvenOdd(int[] arr) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0) {
                even ++ ;
            }
            else {
                odd ++ ;
            }
        }
        return "even: " +even+ " odd: " +odd ;

    }

}
