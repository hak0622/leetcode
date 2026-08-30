import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer>map = new HashMap<>();
        int line = nums.length / 2;

        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);

            if(map.get(nums[i]) > line) return nums[i];
        }
        return 0;
    }
}