class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> h1 = new HashMap<>();
        int[] a = new int[2];
        for(int i=0;i<nums.length;i++){
            if(h1.containsKey(nums[i])){
                a[0]=h1.get(nums[i]);
                a[1]=i;
            }
            h1.put(target-nums[i], i);
        }
        return a;
    }
}
