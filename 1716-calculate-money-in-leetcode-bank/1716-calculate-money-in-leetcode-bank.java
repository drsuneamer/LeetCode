class Solution {
    public int totalMoney(int n) {
        int ans = 0;
        int q = n / 7 + 1;  // 몫
        int r = n % 7;  // 나머지
        
        for (int i = 1; i < q; i++) {
            ans += (i + 3) * 7;
        }
        
        for (int i = 0; i < r; i++) {
            ans += i + q;
        }
        
        return ans;
    }
}