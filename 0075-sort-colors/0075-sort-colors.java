class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;
        int idx = 0;

        for(int n : nums){
            if(n == 0) zero++;
            else if(n == 1) one++;
            else two++;
        }

        while(zero > 0){
            nums[idx++] = 0;
            zero--;
        }

        while(one > 0){
            nums[idx++] = 1;
            one--;
        }

        while(two > 0){
            nums[idx++] = 2;
            two--;
        }
    }
}