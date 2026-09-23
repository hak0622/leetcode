class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = Integer.MIN_VALUE;
        double sum = 0;

        for(int i=0; i<nums.length - k + 1; i++){
            if(i == 0){
                for(int j=i; j<k+i; j++){
                    sum += nums[j];
                }
            }else{
                sum = sum - nums[i-1] + nums[k+i-1];
            }
            
            double avg = sum / k;
            max = Math.max(avg, max);
        }

        return max;
    }
}