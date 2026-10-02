package Arrays;

public class HighestAltitude {

    public static void main(String[] args) {
        HighestAltitude h = new HighestAltitude();
        int ans = h.largestAltitude(new int[]{-4,-3,-2,-1,4,3,2});
        System.out.println(ans);
    }

    public int largestAltitude(int[] gain) {
        int[] temp = new int[gain.length + 1];
        int element = 0;
        temp[0] = 0;

        for (int i = 0; i < gain.length; i++) {
            element += gain[i] ;
            temp[i+1] = element;
        }

        int maxVal = temp[0];
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] > maxVal) {
                maxVal = temp[i];
            }
        }
        return maxVal;

    }
}


