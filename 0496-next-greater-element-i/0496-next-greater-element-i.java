class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer>list = new ArrayList<>();

        for(int i=0; i<nums1.length; i++){
            int find = nums1[i];
            int answer = -1;

            for(int j=0; j<nums2.length; j++){
                if(find == nums2[j]){
                    for(int k=j+1; k<nums2.length; k++){
                        if(nums2[k] > find){
                            answer = nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }
            list.add(answer);
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}