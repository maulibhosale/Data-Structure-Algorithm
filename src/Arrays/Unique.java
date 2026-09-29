package Arrays;

public class Union {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 4, 5, 6};

        solve(arr1, arr2 );
    }

    static void solve(int[] arr1, int[] arr2){

        int[] printed = new int[arr1.length];
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {

            for(int j = 0; j< arr2.length; j++) {
                if(arr1 != arr2) {
                    System.out.print(arr1[i] + " ");
                }
            }
        }
    }
}
