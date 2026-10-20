class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        int answer = 0;

        for(int num : nums){
            set.add(num);
        }

        for(int num : set){
            if(!set.contains(num - 1)){
                int cur = num;
                int count = 1;

                while(set.contains(cur + 1)){
                    cur++;
                    count++;
                }

                answer = Math.max(answer,count);
            }
        }
        return answer;
    }
}