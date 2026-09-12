class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>list = new ArrayList<>();
        boolean[]check = new boolean[nums.length+1];        
        
        for(int i=0; i<nums.length; i++){
            check[nums[i]] = true;
        }

        for(int i=1; i<check.length; i++){
            if(!check[i]) list.add(i);
        }
        return list;
    }
}