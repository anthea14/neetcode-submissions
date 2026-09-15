class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int[] ans = new int[len];
        int j = 0;
        for(int i=0;i<len;i++){
            if(nums[i]!=val){
                ans[j]=nums[i];
                j++;
            }
        }
        for(int k=0;k<j;k++){
            nums[k] = ans[k];
        }
        return j;
    }
}