class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int sum = 0;
            int leftSum = 0;
            int rightSum = 0;

            if(i == 0){
                for(int j=1; j<nums.length; j++){
                    sum = sum + nums[j];
                }
                if(sum == 0) return 0;
            }else{
                for(int k=0; k<i; k++){
                    leftSum = leftSum + nums[k];
                }

                for(int l=i+1; l<nums.length; l++){
                    rightSum = rightSum + nums[l];
                }

                if(leftSum == rightSum) return i;
            }
        }
        return -1;
    }
}