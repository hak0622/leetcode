class Solution {
    public int missingNumber(int[] nums) {
        int[]copy = new int[nums.length + 1];

        for(int i=0; i<nums.length; i++){
            copy[nums[i]] = 1;
        }

        for(int i=0; i<copy.length; i++){
            if(copy[i] != 1) return i;
        }
        return 0;
    }
}