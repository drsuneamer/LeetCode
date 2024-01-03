class Solution {
    public int[] evenOddBit(int n) {
        int[] ans = new int[2];
        String bin = Integer.toBinaryString(n);
        
        for (int i = bin.length() - 1; i >= 0; i--) {
            int idx = bin.length() - i - 1;
            if (bin.charAt(i) == '1') {
                if (idx % 2 == 1) {
                    ans[1]++;
                } else {
                    ans[0]++;
                }
            }
        }
        
        return ans;
    }
}