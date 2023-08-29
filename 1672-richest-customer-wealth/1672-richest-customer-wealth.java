class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        
        for (int[] account : accounts) {
            int sum = 0;
            for (int a : account) {
                sum += a;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        
        return ans;
    }
}