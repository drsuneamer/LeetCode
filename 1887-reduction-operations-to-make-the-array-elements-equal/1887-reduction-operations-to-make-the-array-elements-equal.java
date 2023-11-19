class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int start = 0;
        int cur = nums[0];
        
        for (int n : nums) {
            if (n > cur) {
                cur = n;
                start++;
            }
            ans += start;
        }
        
        return ans;
    }
}