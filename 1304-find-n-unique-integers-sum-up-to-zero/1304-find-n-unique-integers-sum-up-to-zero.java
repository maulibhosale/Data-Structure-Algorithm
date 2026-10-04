class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        if(n%2==0){
            int temp = 1;
            for (int i = 0; i < n; i+=2) {
                ans[i] = -temp;
                ans[i+1] = temp;
                temp++;
            }
        }
        else{
            int temp = 1;
            ans[0] = 0;
            for (int i = 1; i < n; i+=2) {
                ans[i] = -temp;
                ans[i+1] = temp;
                temp++;
            }
        }
        return ans;
    }
}