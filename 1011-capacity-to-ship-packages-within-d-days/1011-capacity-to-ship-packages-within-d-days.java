class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;

        for(int w : weights){
            left = Math.max(left, w);
            right = right + w;
        }

        while(left < right){
            int mid = left + (right - left) / 2;

            int day = 1;
            int sum = 0;

            for(int w : weights){
                if(sum + w > mid){
                    day++;
                    sum = 0;
                }

                sum = sum + w;
            }

            if(day <= days){
                right = mid;
            }else{
                left = mid + 1;
            }
        }

        return right;
    }
}