class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer>map1 = new HashMap<>();
        Map<Integer,Integer>map2 = new HashMap<>();
        List<Integer>list = new ArrayList<>();

        for(int i=0; i<nums1.length; i++){
            map1.put(nums1[i], map1.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0; i<nums2.length; i++){
            map2.put(nums2[i], map2.getOrDefault(nums2[i],0)+1);
        }

        for(int k : map1.keySet()){
            if(map2.containsKey(k)){
                int count = Math.min(map1.get(k), map2.get(k));

                for(int i=0; i<count; i++){
                    list.add(k);
                }
            }
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}