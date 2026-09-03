import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(int c : map.keySet()){
            if(map.get(c) > nums.length/2){
                return c;
            }
        }
        return 0;
    }
}