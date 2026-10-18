class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int sumL = 0;
            int sumR = 0;

            if(i == 0){
                for(int j=i+1; j<nums.length; j++){
                    sumR = sumR + nums[j];
                }

                if(sumR == 0) return 0;
            }else if(i == nums.length-1){
                for(int k=0; k<i; k++){
                    sumL = sumL + nums[k];
                }

                if(sumL == 0) return nums.length-1;
            }else{
                for(int l=0; l<i; l++){
                    sumL = sumL + nums[l];
                }
                for(int r=i+1; r<nums.length; r++){
                    sumR = sumR + nums[r];
                }

                if(sumL == sumR) return i;
            }
        }
        return -1;
    }
}