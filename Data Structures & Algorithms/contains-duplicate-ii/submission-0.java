class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        HashMap<Integer, Integer> h1 = new HashMap<>();
        for(int i=0;i<len;i++){
            if(h1.containsKey(nums[i])){
                int diff = i - h1.get(nums[i]);
                if(diff<=k){
                    return true;
                }
            }
            h1.put(nums[i],i);
        }
        return false;
    }
}