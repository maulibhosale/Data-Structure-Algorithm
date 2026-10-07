package Arrays;

public class SearchElement {

    public void Check(int[][] arr, int target){
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target) {
                    System.out.println("Found at row " + (i + 1) + ", column " + (j + 1));
                    found = true;
                }
            }
        }
        if (found == false) {
            System.out.println("Element not found");
        }
    }

    static void main(String[] args) {
        int[][] arr =  {
                {4, 8, 2},
                {7, 1, 9},
                {3, 6, 5}
        };
        SearchElement se = new SearchElement();
        se.Check(arr, 11);
    }
}
