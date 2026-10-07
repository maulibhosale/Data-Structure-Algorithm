package Arrays;

public class CountZeroAndOne {

    public void count(int[] demo){
        int zeroCount = 0;
        int oneCount = 0;

        for (int i = 0; i < demo.length; i++) {
            if(demo[i] == 0) {
                zeroCount++;
            }
        }
        for (int i = 0; i < demo.length; i++) {
            if(demo[i] == 1) {
                oneCount++;
            }
        }
        System.out.println("0: " +zeroCount);
        System.out.println("1: " +oneCount);
    }

    static void main(String[] args) {
        CountZeroAndOne c = new CountZeroAndOne();
        c.count(new int[]{0,2,3,1,0,1,4,1,0,6,7,3,0,4});
    }
}
