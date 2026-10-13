class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int left = 0;
        int answer = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];

            while(sum >= target){
                answer = Math.min(answer, i - left + 1);
                sum = sum - nums[left];
                left++; 
            }
        }

        return answer == Integer.MAX_VALUE ? 0 : answer;
    }
}