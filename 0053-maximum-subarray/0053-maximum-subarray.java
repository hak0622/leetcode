class Solution {
    public int maxSubArray(int[] nums) {
        int cur = nums[0];
        int maxSum = nums[0];

        for(int i=1; i<nums.length; i++){
            cur = Math.max(cur + nums[i], nums[i]);
            maxSum = Math.max(maxSum, cur);
        }
        return maxSum;
    }
}