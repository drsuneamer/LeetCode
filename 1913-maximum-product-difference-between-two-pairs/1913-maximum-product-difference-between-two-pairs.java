class Solution {
    public int maxProductDifference(int[] nums) {
        int ans = 0;
        int len = nums.length;
        
        Arrays.sort(nums);
        ans = nums[len - 1] * nums[len - 2] - nums[0] * nums[1];
        return ans;
    }
}