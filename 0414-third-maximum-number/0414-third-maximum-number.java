class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer>set = new HashSet<>();

        for(int n : nums){
            set.add(n);
        }

        List<Integer>list = new ArrayList<>(set);
        Collections.sort(list);

        if(list.size() < 3) return list.get(list.size()-1);

        return list.get(list.size()-3);
    }
}