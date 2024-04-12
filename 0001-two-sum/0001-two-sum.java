class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = nums.length;
        int[] ans = new int[2];
        
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        
        return ans;
    }
}