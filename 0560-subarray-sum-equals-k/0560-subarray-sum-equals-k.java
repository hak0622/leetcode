class Solution {
    public int subarraySum(int[] nums, int k) {
        int[]prefix = new int[nums.length + 1];
        int answer = 0;

        for(int i=0; i<nums.length; i++){
            prefix[i+1] = prefix[i] + nums[i];
            //0 1 3 6
        }

        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                int sum = prefix[j+1] - prefix[i];

                if(sum == k) answer++;
            }
        }

        return answer;
    }
}